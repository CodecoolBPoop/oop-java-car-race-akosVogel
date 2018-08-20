package com.codecool.akosrace;

abstract class Vehicle {

    private int normalSpeed;
    private String name;
    private int distanceTraveled = 0;
    private String type;


    int getNormalSpeed() {
        return this.normalSpeed;
    }

    void setNormalSpeed(int normalSpeed) {
        this.normalSpeed = normalSpeed;
    }

    String getName() {
        return this.name;
    }

    void setName(String name) {
        this.name = name;
    }

    int getDistanceTraveled() {
        return this.distanceTraveled;
    }

    void setDistanceTraveled(int distanceTraveled) {
        this.distanceTraveled = distanceTraveled;
    }

    void setType(String type) {
        this.type = type;
    }

    String printRaceDetails () {
        return this.name + " traveled " + this.distanceTraveled + " km (" + this.type + ").";
    }


    abstract void moveForAnHour(Race race);

}
