package edu.learning.builder.director;

import edu.learning.builder.HouseBuilder;
import edu.learning.model.House;

public class CivilEngineer {
    
    private HouseBuilder houseBuilder;
    
    public CivilEngineer(HouseBuilder houseBuilder){
        this.houseBuilder = houseBuilder;
    }
    
    public House getHouse(){
        return this.houseBuilder.getHouse();
    }
    
    public void constructHouse(){
        this.houseBuilder.buildBasement();
        this.houseBuilder.buildStructure();
        this.houseBuilder.buildRoof();
        this.houseBuilder.buildInterior();
    }
    
}
