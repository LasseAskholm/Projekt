package com.company;

public class TemperatureSensor extends Sensor {




    public TemperatureSensor(String name, double value) {
        super(name, value);
    }


    @Override
    public String toString() {
        return"name: "+this.getName()+" id: "+this.getID()+" value: "+getValue();
    }
}
