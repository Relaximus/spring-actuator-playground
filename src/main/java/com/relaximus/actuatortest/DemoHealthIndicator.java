package com.relaximus.actuatortest;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.boot.actuate.health.Status;
import org.springframework.stereotype.Component;

@Component
public class DemoHealthIndicator implements HealthIndicator {
    private static int count = 0;
    private static Status WARMING = new Status("WARMING");

    @Override
    public Health health() {
        return ++count > 2
            ? Health.up().build()
            : Health.status(WARMING).build();
    }
}
