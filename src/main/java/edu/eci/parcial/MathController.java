package edu.eci.parcial;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    private List output = new ArrayList<>();

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }

    @GetMapping("/factores")
    public String getFactor(@RequestParam(value = "value") String value) {
        return factor(num);
    }

    @GetMapping("/primos")
    public String getPrime(@RequestParam(value = "value") String value) {
        return primo(num);
    }

    public List<output> factor() {
        return new ArrayList<>(
            if (num <=1) {
                return 1;
            } else {
                int mod = num % 2;
                output = add.List<output>(mod);
                return output;
            });
    }

    public List<output> primo() {
        return new ArrayList<>(
        if (num <= 1) {
            return 1;
        } elseif(num % num == 1) {
            return num;
        } else {
            val = num.factor();
            output = add.List<output>(val);
            return output;
        });
    }
}