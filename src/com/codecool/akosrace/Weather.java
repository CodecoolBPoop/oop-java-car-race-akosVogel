package com.codecool.akosrace;

import java.util.Random;


class Weather {

    private static boolean raining;


     //30% chance of rain.

    static void setRaining() {
        int chanceOfRain = new Random().nextInt(10);
        raining = chanceOfRain < 3;
    }


     // return True if it's raining, false if not

    static boolean isRaining() {
        return raining;
    }
}
