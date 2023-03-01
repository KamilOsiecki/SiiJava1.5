package org.example;

public class Truck extends Vehicle{
    public Truck(int maxSpeed) {
        super(maxSpeed);
    }
    @Override
    public void move(){
        System.out.println("Im truck, my max speed is: " + getMaxSpeed());
    }
}