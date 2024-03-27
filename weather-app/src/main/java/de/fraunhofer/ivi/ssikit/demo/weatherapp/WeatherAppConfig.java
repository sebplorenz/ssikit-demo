package de.fraunhofer.ivi.ssikit.demo.weatherapp;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "weather")
@Getter
@Setter
public class WeatherAppConfig {

    private String providerUrl;

}
