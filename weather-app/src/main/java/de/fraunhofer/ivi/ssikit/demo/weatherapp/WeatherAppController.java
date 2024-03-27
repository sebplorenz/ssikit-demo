package de.fraunhofer.ivi.ssikit.demo.weatherapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class WeatherAppController {

    @Autowired
    WeatherProviderClient client;

    @GetMapping("/weatherapp")
    @ResponseBody
    public Map<String, String> getWeather() {
        return client.getWeather();
    }
}
