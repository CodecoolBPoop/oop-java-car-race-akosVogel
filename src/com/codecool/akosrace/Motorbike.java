package com.codecool.akosrace;

import java.util.Random;


public class Motorbike extends Vehicle {

    private static int nameNumber = 0;


    Motorbike() {
        nameNumber++;
        this.setName("Motorbike " + nameNumber);
        this.setNormalSpeed(100);
        this.setType("Motorbike");
        System.out.println(this.getName() + " is created!");
    }


    @Override
    public void moveForAnHour(Race race) {
        if (Weather.isRaining()) {
            this.setNormalSpeed(this.getNormalSpeed() - (new Random().nextInt(45) + 5));
            return;
        }

        this.setDistanceTraveled(this.getDistanceTraveled() + this.getNormalSpeed());
        this.setNormalSpeed(100);
    }

}
