package StrategyPattern.WithStrategyPattern.Strategy;

public class SportsStrategy implements DriveStrategy {
    public void drive(){
        System.out.println("Sports drive capability");
    }
}
