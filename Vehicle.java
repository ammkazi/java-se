/*
 * Project: Vehicle
 * File: Vehicle.java
 * -----
 * File Created: Sunday, 15th September 2019 11:06:00 am
 * Author: Aiman Kazi (aiman@visuallabs.in)
 * -----
 * Last Modified: Sunday, 15th September 2019 11:06:42 am
 * -----
 * Copyright Aiman Kazi, Visual Labs IT Services Pvt Ltd.
 */

class Vehicle {
    public static int totalVehicle = 0;
    private int topSpeed;
    private String vColor;
    private String brand;
    public int regNo;

    public Vehicle() {
        totalVehicle++;
        regNo = totalVehicle;
        System.out.println("I am default constructor");
        topSpeed = 120;
        vColor = "White";
        brand = null;
    }

    public Vehicle(int t, String c, String b) {
        totalVehicle++;
        regNo = totalVehicle;
        System.out.println("I am parameterized constructor");
        topSpeed = t;
        vColor = c;
        brand = b;
    }

    public void displayCarInfo() {

        System.out.println("Brand: " + brand);
        System.out.println("Top Speed: " + topSpeed);
        System.out.println("Color : " + vColor);
    }

}