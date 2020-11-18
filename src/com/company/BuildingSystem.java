package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class BuildingSystem {

    private List<Building> buildings;

    public BuildingSystem(){
        buildings=new ArrayList<>();
    }

    public List<Building> getBuildings() {
        return buildings;
    }
    public UUID addBuilding(String name){
        Building building=new Building(name);
        buildings.add(building);
        return building.getID();
    }

    public void removeBuilding(UUID id){
        for (Building building:buildings) {
            if(building.getID()==id){
                buildings.remove(building);
            }

        }
    }
}
