package com.br.ifms.mspayroll.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.ifms.mspayroll.services.PayRollService;

import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/payroll")
public class PayRollController {
    final private PayRollService service;
    public PayRollController(PayRollService service){
        this.service = service;
    }

    @GetMapping("/day/{days}/workerid/{id}")
    public ResponseEntity<Double> getPayRoll(@PathVariable Integer days, 
                                            @PathVariable Integer id  ){
                                                
    return ResponseEntity.ok( service.getWorkerSalary(days,id));                                           
    }
    
}
