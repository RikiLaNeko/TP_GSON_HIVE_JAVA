package org.example;


import com.google.gson.Gson;
import org.example.pogo.Response;

import java.util.Base64;

public class DecodeJson {

    public static void decode(String payload) {
        // Convertir le payload en un objet Response
        Gson gson = new Gson();
        Response pojoTTNV3 = gson.fromJson(payload, Response.class);

        // Afficher les informations requises
        System.out.println("Application ID: " + pojoTTNV3.getEndDeviceIds().getApplicationIds().getApplicationId());
        System.out.println("Gateway ID: " + pojoTTNV3.getUplinkMessage().getRxMetadata().get(0).getGatewayIds().getGatewayId());

        // Décoder le frm_payload
        byte[] decodedBytes = Base64.getDecoder().decode(pojoTTNV3.getUplinkMessage().getFrmPayload());
        String hexString = bytesToHex(decodedBytes);

        int decimale = Integer.parseInt(hexString.substring(34, 36), 16);
        int entiere = Integer.parseInt(hexString.substring(36, 38), 16);

        System.out.println("Temperature: " + entiere + "." + decimale);

        // Afficher le spreading_factor
        System.out.println("Spreading Factor: " + pojoTTNV3.getUplinkMessage().getSettings().getDataRate().getLora().getSpreadingFactor());
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
