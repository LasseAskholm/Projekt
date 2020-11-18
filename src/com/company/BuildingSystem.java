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
    public UUID addBuilding(Building building){
        buildings.add(building);
        return building.getID();
    }

    public void removeBuilding(UUID id){
        buildings.removeIf(building -> building.getID() == id);
    }
}
