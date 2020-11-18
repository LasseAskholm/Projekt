package com.company;

import java.util.List;
import java.util.UUID;

public class Main {

    public static void main(String[] args) {
        BuildingSystem bs = new BuildingSystem();

        UUID school = bs.addBuilding("school");
        UUID store = bs.addBuilding("Store");


        Building libraryBuilding = new Building("library");

        UUID westDoor = libraryBuilding.addCo2Sensor("West Door");


        libraryBuilding.getSensorFromID(westDoor).setValue(10);


        UUID bLibrary = bs.addBuilding(libraryBuilding);



        System.out.println(bs.getBuildings() + " " + libraryBuilding.getSensors());

    }
}
