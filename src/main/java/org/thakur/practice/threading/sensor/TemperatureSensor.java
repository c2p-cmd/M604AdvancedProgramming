package org.thakur.practice.threading.sensor;

import java.time.Duration;
import java.util.Random;

public class TemperatureSensor extends Sensor {
    final Random random = new Random(1_00_000);

    @Override
    Duration getInterval() {
        return Duration.ofMillis(500);
    }

    @Override
    public void showCurrentReading() {
        System.out.println("Temperature: " + random.nextInt(-10, 36) + "C");
    }
}
