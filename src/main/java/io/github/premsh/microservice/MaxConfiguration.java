package io.github.premsh.microservice;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("microserviceapp")
public class MaxConfiguration {
    public MaxConfiguration() {
    }

    public MaxConfiguration(double max) {
        this.max = max;
    }

    private double max;

    public double getMax() {
        return max;
    }

    public void setMax(double max) {
        this.max = max;
    }
}
