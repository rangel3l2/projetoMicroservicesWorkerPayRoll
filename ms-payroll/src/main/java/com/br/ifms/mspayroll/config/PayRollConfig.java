package com.br.ifms.mspayroll.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class PayRollConfig {

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();

    }
    
}
