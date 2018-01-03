package com.ski.builder;

import com.ski.machine.Webtop;
import com.ski.machine.WebtopBuilder;

public class WebtopProducer {
    public static  void main(String args[]) {

        // We can observe here optional argumnet touchScreenEnabled is not set
        Webtop webtopBuilder = new WebtopBuilder(4,250, "Core i7", "intel ati core")
                .setBluetooth("6.4 Bluetooth 2.0 + EDR")
                .setMediaCard("CompactFlash (CF)").build();

        System.out.println(webtopBuilder);

    }
}
