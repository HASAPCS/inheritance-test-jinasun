package com.example;

// TODO: make this class extend ElectronicDevice

public class Smartphone {
    // TODO: Declare the necessary attributes (brand, model, batteryLevel)
    private int batteryLevel;
    // Constructor to initialize the Smartphone object
    public Smartphone(String brand, String model, int batteryLevel) {
        this.batteryLevel = batteryLevel;

        
        // TODO: Initialize the attributes with the provided parameters
    }

    // checkBattery
    // TODO: Implement a method to check the battery level and return a message based on the level
    // Implement the checkBattery method to return:
        // "Warning: Battery low!" if the battery level is 20% or lower.
        // "Battery level is okay: [batteryLevel]%." if the battery level is above 20%.

    // TODO: Implement necessary getters for the attributes

    // OPTIONALLY implement the required methods to pass the BonusTest.

}

// if batteryyLevel <=20 println ("Warning: Battery low!")

// if batteryLevel > 20 println ("Battery level is okay: [batteryLevel]%.")