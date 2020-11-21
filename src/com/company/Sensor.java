package com.company;


import dataAccess.Save;

import java.io.FileNotFoundException;
import java.util.UUID;

public abstract class  Sensor extends Unit {
    private double value;



    public Sensor(String name, double value){
        super(name);
        this.value=value;
    }


    public void saveValue() throws FileNotFoundException {
        Save.save(this.getID(), this.toString());
    }

    public double getValue() {
        return this.value;
    }

    public void setValue(double value){
        this.value=value;
    }
}
