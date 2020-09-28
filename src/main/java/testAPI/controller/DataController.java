package testAPI.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {

    @GetMapping(path = "/vat")
    public double getVAT(){
        return 0.21;
    }

    @GetMapping(path = "/price/{terminalName}")
    public double getBasePrice(@PathVariable String terminalName) {
        return 10;
    }
}
