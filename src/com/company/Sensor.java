package com.company;

import java.util.UUID;

public abstract class  Sensor extends Unit {
    private double value;



    public Sensor(String name, double value){
        super(name);
        this.value=value;
    }



    public double getValue(){
        return this.value;
    }

    public void setValue(double value){
        this.value=value;
    }
}
