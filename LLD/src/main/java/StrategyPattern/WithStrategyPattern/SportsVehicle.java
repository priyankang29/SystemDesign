package StrategyPattern.WithStrategyPattern;

import StrategyPattern.WithStrategyPattern.Strategy.DriveStrategy;
import StrategyPattern.WithStrategyPattern.Strategy.SportsStrategy;

public class SportsVehicle extends Vehicle {
    SportsVehicle() {
        super(new SportsStrategy());
    }
}
