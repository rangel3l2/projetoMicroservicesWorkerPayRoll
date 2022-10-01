package com.br.ifms.mspayroll.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
@Service
public class PayRollService {
    final private RestTemplate restTemplate;
    @Value("${ms-worker.url}")
    private String workerUrl;

    public PayRollService(RestTemplate restTemplate){
        
        this.restTemplate = restTemplate;

    }
public Worker getWorker(Integer id){
    restTemplate.getForObject(null, null, null)

}
}
