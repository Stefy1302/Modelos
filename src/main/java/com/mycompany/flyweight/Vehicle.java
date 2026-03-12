/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.flyweight;

/**
 *
 * @author MyM
 */
public class Vehicle {
    private String plate; 
    private float x, y;  
    private float speed; 
    private VehicleType type;

    public Vehicle(String plate, float x, float y, float speed, VehicleType type) {
        this.plate = plate;
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.type = type;
    }
}