package edu.learning.builder;

import edu.learning.model.House;

public class TipiHouseBuilder implements HouseBuilder{
    
    private House house;
    
    public TipiHouseBuilder(){
        this.house = new House();
    }

    @Override
    public void buildBasement() {
        this.house.setBasement("Wooden Poles");
    }

    @Override
    public void buildStructure() {
        house.setStructure("Wood and Ice");
    }

    @Override
    public void buildRoof() {
        house.setRoof("Wood, caribou and seal skins");
    }

    @Override
    public void buildInterior() {
        house.setInterior("Fire wood");
    }

    @Override
    public House getHouse() {
        return this.house;
    }
    
}
