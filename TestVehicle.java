/*
 * Project: Vehicle
 * File: TestVehicle.java
 * -----
 * File Created: Sunday, 15th September 2019 11:08:58 am
 * Author: Aiman Kazi (aiman@visuallabs.in)
 * -----
 * Last Modified: Sunday, 15th September 2019 11:09:01 am
 * -----
 * Copyright Aiman Kazi, Visual Labs IT Services Pvt Ltd.
 */

class TestVehicle {
    public static void main(String[] args) {

        Vehicle v = new Vehicle();
        v.displayCarInfo();

        Vehicle m = new Vehicle(300, "REDHOT", "Ferrari");
        m.displayCarInfo();

        System.out.println(v.regNo);
        System.out.println(m.regNo);
        System.out.println(Vehicle.totalVehicle);

        /*
         * System.out.println(Vehicle.totalVehicle);
         * 
         * Vehicle merc = new Vehicle(); merc.topSpeed = 240; merc.brand =
         * "Mercedez Benz"; merc.vColor = "purple";
         * 
         * Vehicle fiat = new Vehicle(); fiat.topSpeed = 140; fiat.brand = "Fiat Uno";
         * fiat.vColor = "Blue";
         * 
         * System.out.println(merc.brand + " " + merc.topSpeed); //
         * System.out.println(merc.totalVehicle);
         * 
         * Vehicle maruti = new Vehicle(); maruti.brand = "Maruti Suzuki Dzire";
         * System.out.println(maruti.brand);
         */
    }
}