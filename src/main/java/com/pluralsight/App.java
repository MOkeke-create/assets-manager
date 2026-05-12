package com.pluralsight;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<Asset> assets = new ArrayList<>();
        assets.add(new House("Modern", "05/12/2026",200000,"1234, Albuquerque Rd 75003",2,2500,50));
        assets.add(new Vehicle("Supercar", "05/12/2026",500000,"McLaren 720S",2020, 1000));
        {
            String message;
            if (assets.get(0) instanceof House house) {
                message = "House at " + house.getAddress();
                System.out.println(message);
            } else if (assets.get(0) instanceof Vehicle vehicle) {
                message = "Vehicle: " + vehicle.getYear() + " " + vehicle.getMakeModel();
                System.out.println(message);
            }
        }
        {
            String message;
            if (assets.get(1) instanceof House house) {
                message = "House at " + house.getAddress();
                System.out.println(message);
            } else if (assets.get(1) instanceof Vehicle vehicle) {
                message = "Vehicle: " + vehicle.getYear() + " " + vehicle.getMakeModel();
                System.out.println(message);
            }
        }
    }
}
