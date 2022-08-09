package com.example.MicroService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class nums_controller {
    @Autowired
    private num_configration num_config;
    @GetMapping("/Max&Min_nums")
    public num_configration number(){
        return new num_configration(num_config.getMax_num(),num_config.getMin_num());}


}
