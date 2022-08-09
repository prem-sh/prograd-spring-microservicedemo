package io.github.premsh.microservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MinMaxController {

    @Autowired
    private MaxConfiguration maxConfiguration;
    @Autowired
    private MinConfiguration minConfiguration;

    @GetMapping("/max")
    public MaxConfiguration getMax(){
        return new MaxConfiguration(maxConfiguration.getMax());
    }
    @GetMapping("/min")
    public MinConfiguration getMin(){
        return new MinConfiguration(minConfiguration.getMin());
    }
}
