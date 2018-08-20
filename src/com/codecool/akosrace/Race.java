package com.codecool.akosrace;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;


class Race {

    private List<Vehicle> vehicles = new ArrayList<>(30);


    //Creates 10 cars, 10 trucks and 10 motorcycles.


    private void createVehicles() {
        for (int i = 0; i < 10; i++) {
            vehicles.add(new Car());
            vehicles.add(new Motorbike());
            vehicles.add(new Truck());
            //System.out.println(Arrays.deepToString(vehicles.toArray()));
            }
        }


     // Simulate the race by calling moveForAnHour() on every vehicle the given times and set weather


    private void simulateRace(int hour) {
        for (int i = 0; i < hour; i++) {
            Weather.setRaining();
            for (Vehicle vehicle: vehicles) {
                vehicle.moveForAnHour(this);
            }
        }
    }

     // Print each vehicle's name, distance traveled ant type.

    private void printRaceResults() {
        System.out.println("\nRace results: ");
        for (Vehicle vehicle: vehicles) {
            System.out.println(vehicle.printRaceDetails());
        }
    }

    //True if there is a broken truck, false if there is not

    boolean isThereABrokenTruck() {
        for (Vehicle vehicle: vehicles) {
            if (vehicle instanceof Truck) {
                if (((Truck) vehicle).isBrokenDown()) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {

        Race race = new Race();
        int hour = 50;
        race.createVehicles();
        race.simulateRace(hour);
        race.printRaceResults();

    }
}
