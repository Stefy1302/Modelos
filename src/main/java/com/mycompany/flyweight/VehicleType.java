/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.flyweight;

/**
 *
 * @author MyM
 */
public class VehicleType {
    private String brand;
    private String model;
    private String color;

    public VehicleType(String brand, String model, String color) {
        this.brand = brand;
        this.model = model;
        this.color = color;
    }

    public void render(String plate, float x, float y, float speed) {
    }
}