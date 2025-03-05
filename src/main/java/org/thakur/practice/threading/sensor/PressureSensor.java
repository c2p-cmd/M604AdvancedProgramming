package org.thakur.practice.threading.sensor;

import java.time.Duration;
import java.util.Random;

public class PressureSensor extends Sensor {
    final Random random = new Random(1_75_000);

    @Override
    Duration getInterval() {
        return Duration.ofSeconds(1);
    }

    @Override
    void showCurrentReading() {
        System.out.println("Pressure: " + random.nextInt(950, 1051) + " hPa");
    }
}
