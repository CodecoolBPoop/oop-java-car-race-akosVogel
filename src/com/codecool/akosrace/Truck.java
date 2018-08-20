package com.codecool.akosrace;

import java.util.Random;


class Truck extends  Vehicle {

    private int breakdownTurnsLeft = 0;


    Truck() {
        this.setName(Integer.toString(new Random().nextInt(1000)));
        this.setNormalSpeed(100);
        this.setType("Truck");
        System.out.println("Truck number " + this.getName() + " created!");
    }


    private int getBreakdownTurnsLeft() {
        return breakdownTurnsLeft;
    }

    private void setBreakdownTurnsLeft() {
        this.breakdownTurnsLeft = 2;
    }

    boolean isBrokenDown() {
        return this.breakdownTurnsLeft != 0;
    }

    @Override
    void moveForAnHour(Race race) {
        if (!this.isBrokenDown()) {
            this.setDistanceTraveled(this.getDistanceTraveled() + this.getNormalSpeed());
            int breakdownChance = new Random().nextInt(100);

            if (breakdownChance < 5) {
                this.setBreakdownTurnsLeft();
            }
        }
        else {
            this.breakdownTurnsLeft--;
        }
    }

}
