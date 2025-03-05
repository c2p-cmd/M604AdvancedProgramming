package org.thakur.practice.threading.sensor;

import java.time.Duration;

public abstract class Sensor implements Runnable {
    abstract void showCurrentReading();

    abstract Duration getInterval();

    @Override
    public void run() {
        while (true) {
            showCurrentReading();
            try {
                Thread.sleep(getInterval());
            } catch (InterruptedException e) {
                System.out.println("Stopped: " + e.getMessage());
                return;
            }
        }
    }
}
