package pl.lukasz.demo;

import org.springframework.stereotype.Component;

import org.springframework.web.client.RestTemplate;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

@Component
public class TemperaturePrinter {
    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj miasto");
        String maisto = scanner.nextLine();


        String url = "http://api.openweathermap.org/data/2.5/weather?q="+maisto+"&appid=b6ada6c936536304134229eab080b093&units=metric";
        RestTemplate restTemplate = new RestTemplate();
        WhetherAnswer whetherAnswer = restTemplate.getForObject(url,WhetherAnswer.class);

        System.out.println("Temperatura dla: " + maisto+" "+whetherAnswer.getMain().getTemp()+"*C");
    }

}
