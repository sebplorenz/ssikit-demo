package de.fraunhofer.ivi.ssikit.demo.weatherprovider;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;

@RequestMapping("/weather")
@RestController
public class WeatherController {

    @GetMapping(
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Map<String, String> getWeather() {
        return Map.of("time", DateTimeFormatter.ISO_DATE_TIME.format(LocalDateTime.now()), "weather", "sunny");
    }
}
