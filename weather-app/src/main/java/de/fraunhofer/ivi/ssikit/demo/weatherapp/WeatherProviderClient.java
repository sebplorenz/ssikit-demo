package de.fraunhofer.ivi.ssikit.demo.weatherapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Component
public class WeatherProviderClient {

    @Autowired
    private WeatherAppConfig config;

    private RestTemplate restTemplate = new RestTemplate();


    public Map<String, String> getWeather() {
        return restTemplate.getForObject(config.getProviderUrl(), Map.class);
    }

}
