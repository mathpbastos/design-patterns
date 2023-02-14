package edu.learning;

import edu.learning.builder.director.CivilEngineer;
import edu.learning.builder.HouseBuilder;
import edu.learning.builder.IglooHouseBuilder;
import edu.learning.model.House;

public class AppRun {

    public static void main(String[] args) {
        HouseBuilder iglooBuilder = new IglooHouseBuilder();
        CivilEngineer engineer = new CivilEngineer(iglooBuilder);
        
        engineer.constructHouse();
        
        House house = engineer.getHouse();
        
        System.out.println("Builder constructed: " + house.toString());
    }
}
