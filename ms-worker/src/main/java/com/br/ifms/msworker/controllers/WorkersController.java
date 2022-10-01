package com.br.ifms.msworker.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.ifms.msworker.models.Workers;


@RestController
@RequestMapping("/worker")
public class WorkersController {

    @GetMapping(value="/{id}")
    public ResponseEntity<Workers> getWorker(@PathVariable Integer id) {
        var worker = new Workers(id);
        
        return ResponseEntity.ok(worker);
    }
  
    }
    @GetMapping("/id/salary")
    public ResponseEntity<Double> getSalaryWorker(@PathVariable Integer id){
        var worker  = new Worker();
        return ResponseEntity.ok(worker.getSalary())
    }
    
    

    
}
