package com.br.ifms.mspayroll.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/payroll")
public class PayRollController {

    @GetMapping("/day/{days}/workerid/{id}")
    public ResponseEntity<PayRoll> getPayRoll(@PathVariable Integer day, 
                                            @PathVariable Integer workerid  ){
                                                

    }
    
}
