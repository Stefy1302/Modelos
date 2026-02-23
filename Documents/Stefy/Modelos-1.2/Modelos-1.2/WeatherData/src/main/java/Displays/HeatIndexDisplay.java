/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Displays;

import Interfaces.*;

public class HeatIndexDisplay implements Observer, DisplayElement {
    private float heatIndex;
    private Subject weatherData;

    public HeatIndexDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float t, float r, float p) {
        // Fórmula del reto
        heatIndex = (float)((-8.78469475556) + (1.61139411 * t) + (2.33854883889 * r) + 
                    (-0.14611605 * t * r) + (-0.012308094 * Math.pow(t, 2)) + 
                    (-0.0164248277778 * Math.pow(r, 2)) + (0.002211732 * Math.pow(t, 2) * r) + 
                    (0.00072546 * t * Math.pow(r, 2)) + (-0.000003582 * Math.pow(t, 2) * Math.pow(r, 2)));
        display();
    }

    @Override
    public void display() {
        System.out.println("Índice de calor: " + heatIndex);
    }
}