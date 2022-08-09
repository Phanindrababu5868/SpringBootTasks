package com.example.MicroService;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("services")

public class num_configration {
    public num_configration(){

    }
    private float max_num;
    private float min_num;

    public num_configration(float max_num, float min_num) {
        this.max_num = max_num;
        this.min_num = min_num;
    }

    public float getMax_num() {
        return max_num;
    }

    public void setMax_num(float max_num) {
        this.max_num = max_num;
    }

    public float getMin_num() {
        return min_num;
    }

    public void setMin_num(float min_num) {
        this.min_num = min_num;
    }
}
