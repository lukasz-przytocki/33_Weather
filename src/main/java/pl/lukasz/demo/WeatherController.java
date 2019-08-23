package pl.lukasz.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WeatherController {

    @GetMapping("/")
    public String dispalyWeather() {
        return "Weather";
    }

}
