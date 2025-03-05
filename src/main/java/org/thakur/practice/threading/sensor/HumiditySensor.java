package org.thakur.practice.threading.sensor;

import java.time.Duration;
import java.util.Random;

public class HumiditySensor extends Sensor {
    final Random random = new Random(1_50_000);

    @Override
    Duration getInterval() {
        return Duration.ofMillis(700);
    }

    @Override
    void showCurrentReading() {
        System.out.println("Humidity: " + random.nextInt(20, 81) + "%");
    }
}
