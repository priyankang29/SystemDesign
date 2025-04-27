package StrategyPattern.WithStrategyPattern;

import StrategyPattern.WithStrategyPattern.Strategy.DriveStrategy;

public class Vehicle {
    DriveStrategy driveObj;
    //constructor injection
    Vehicle(DriveStrategy obj){
        driveObj = obj;
    }
    public void drive(){

        driveObj.drive();
    }
}
