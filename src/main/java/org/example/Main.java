package org.example;
import org.example.hiveMQTT.HiveMq;


public class Main {
    public static void main(String[] args) {
        HiveMq hiveMq = new HiveMq();
        hiveMq.subscribe();
    }
}
