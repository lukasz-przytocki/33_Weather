package pl.lukasz.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WeatherApplication {

    public static void main(String[] args) {
        SpringApplication.run(WeatherApplication.class, args);

//        TemperaturePrinter temperaturePrinter = new TemperaturePrinter();
//        temperaturePrinter.run();
    }

}
