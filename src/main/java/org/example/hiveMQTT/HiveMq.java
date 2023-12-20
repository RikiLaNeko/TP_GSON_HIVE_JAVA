package org.example.hiveMQTT;

import com.google.gson.Gson;
import com.hivemq.client.mqtt.MqttClient;
import com.hivemq.client.mqtt.datatypes.MqttQos;
import com.hivemq.client.mqtt.mqtt3.Mqtt3AsyncClient;
import org.example.DecodeJson;
import org.example.pogo.Response;

import java.net.InetSocketAddress;
import java.util.Base64;

import static org.example.hiveMQTT.ConfigurationHiveMQ_TTN_V3.*;

public class HiveMq {
    private Mqtt3AsyncClient client;

    public HiveMq() {
        run();
        connect();
    }

    private void run() {
        client = MqttClient.builder()
                .useMqttVersion3()
                .serverHost(SERVER_URI)
                .serverPort(PORT)
                .sslWithDefaultConfig()
                .buildAsync();
    }

    private void connect() {
        client.connectWith()
                .simpleAuth()
                .username(USER_NAME)
                .password(PASSWORD)
                .applySimpleAuth()
                .send()
                .whenComplete((mqtt3ConnAck, throwable) -> {
                    if (throwable != null) {
                        System.out.println("échec connection");
                    } else {
                        System.out.println("connexion OK");
                    }
                });
    }

    public void subscribe() {
        client.subscribeWith()
                .topicFilter(TOPIC)
                .qos(MqttQos.fromCode(QOS))
                .callback(mqtt3Publish -> {
                    String payload = new String(mqtt3Publish.getPayloadAsBytes());
                    DecodeJson.decode(payload);
                })
                .send()
                .whenComplete((mqtt3SubAck, throwable) -> {
                    if (throwable != null) {
                        System.out.println("MQTT souscription erreur!");
                    } else {
                        System.out.println("MQTT souscription Ok -> " + SERVER_URI + ":" + PORT);
                    }
                });
    }


    // Convertir un tableau d'octets en une chaîne hexadécimale
    private static String bytesToHex(byte[] bytes) {
        StringBuilder hexString = new StringBuilder();
        for (byte b : bytes) {
            hexString.append(String.format("%02X", b));
        }
        return hexString.toString();
    }
}
