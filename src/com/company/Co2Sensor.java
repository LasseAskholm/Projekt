package com.company;

import java.util.UUID;

public class Co2Sensor extends Sensor {


    public Co2Sensor(String name,double value){
        super(name,value);
    }


    @Override
    public String toString() {
        return"name: "+this.getName()+" id: "+this.getID()+" value: "+getValue();
    }


}
