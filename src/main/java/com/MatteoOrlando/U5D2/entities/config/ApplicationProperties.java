package com.MatteoOrlando.U5D2.entities.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Setter
@Getter
@Component
@ConfigurationProperties(prefix = "app")
public class ApplicationProperties {
    // Metodi getter e setter per coverCharge
    private double coverCharge;

}