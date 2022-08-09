package io.github.premsh.microservice;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("microserviceapp")
public class MinConfiguration {
    public MinConfiguration() {
    }

    public MinConfiguration(double min) {
        this.min = min;
    }

    private double min;

    public double getMin() {
        return min;
    }

    public void setMin(double min) {
        this.min = min;
    }
}

