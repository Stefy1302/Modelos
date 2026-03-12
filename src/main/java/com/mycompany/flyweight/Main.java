/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.flyweight;

/**
 *
 * @author MyM
 */
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Vehicle> fleet = new ArrayList<>();
        int TOTAL_VEHICLES = 4000000;

        for (int i = 0; i < TOTAL_VEHICLES; i++) {
            VehicleType type = VehicleFactory.getVehicleType("Toyota", "Corolla", "Red");
            
            fleet.add(new Vehicle("ABC-" + i, (float)Math.random()*100, (float)Math.random()*100, 60.0f, type));
        }

        System.out.println("Se crearon " + TOTAL_VEHICLES + " vehículos.");
        long memory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.println("Memoria usada: " + (memory / 1024 / 1024) + " MB");
    }
}