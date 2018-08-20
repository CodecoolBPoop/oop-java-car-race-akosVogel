package com.codecool.akosrace;

import java.util.Random;


class Car extends Vehicle {
    private static final int RESTRICTED_SPEED = 75;

    public Car() {
        String[] names = {"Albatross", "Ivory", "Universe", "Raven", "Charm",
                          "Nimbus", "Inquiry", "Voyage", "Dominion", "Inception",
                          "Quicksilver", "Astral", "Trabant", "Lada", "Zastava",
                          "Wartburg", "Polski", "Ferrari", "BMW", "Lamborghini",};
        this.setName(names[new Random().nextInt(20)] + " " + names[new Random().nextInt(20)]);
        this.setNormalSpeed(new Random().nextInt(30) + 80);
        this.setType("Car");
        System.out.println(this.getName() + "'s speed is " + this.getNormalSpeed() + " km/h!");
    }


    @Override
    void moveForAnHour(Race race) {
        if (race.isThereABrokenTruck()) {
            this.setDistanceTraveled(this.getDistanceTraveled() + RESTRICTED_SPEED);
            return;
        }

        this.setDistanceTraveled(this.getDistanceTraveled() + this.getNormalSpeed());
    }

}
