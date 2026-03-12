/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.flyweight;

/**
 *
 * @author MyM
 */
import java.util.HashMap;
import java.util.Map;

public class VehicleFactory {
    private static Map<String, VehicleType> vehicleTypes = new HashMap<>();

    public static VehicleType getVehicleType(String brand, String model, String color) {
        String key = brand + "_" + model + "_" + color;
        if (!vehicleTypes.containsKey(key)) {
            vehicleTypes.put(key, new VehicleType(brand, model, color));
            System.out.println("Creando nuevo tipo de vehículo: " + key);
        }
        return vehicleTypes.get(key);
    }
}