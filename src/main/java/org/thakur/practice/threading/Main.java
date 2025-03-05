package org.thakur.practice.threading;

import org.thakur.practice.threading.sensor.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Task - 2
        final List<Thread> tasks = List.of(
                new Thread(new HumiditySensor(), "Humidity Thread"),
                new Thread(new TemperatureSensor(), "Temperature Thread"),
                new Thread(new PressureSensor(), "Pressure Thread")
        );

        System.out.println("All sensors started");
        tasks.forEach(Thread::start);

        final Thread shutdownHook = new Thread(() -> {
            tasks.forEach(Thread::interrupt);
            try {
                for (Thread task : tasks) {
                    task.join();
                }
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e.getMessage());
            }
            System.out.println("All sensors stopped");
        });

        Runtime.getRuntime().addShutdownHook(shutdownHook);
    }
}
