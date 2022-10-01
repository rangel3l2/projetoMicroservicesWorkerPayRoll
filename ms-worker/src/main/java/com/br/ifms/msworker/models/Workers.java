package com.br.ifms.msworker.models;

import lombok.Data;

@Data
public class Workers {

    private Integer id;    
    private String name;
    private Double salary;

    public Workers( Integer id){
        this.id = 1;
        this.name = "joão";
        this.salary = 3500D;
    }
}
