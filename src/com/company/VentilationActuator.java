package com.company;

public class VentilationActuator extends Actuator {

    public VentilationActuator(String name, double value) {
        super(name, value);
    }

    @Override
    public String toString() {
        return"name: "+this.getName()+" id: "+this.getID()+" value: "+getValue();
    }
}
