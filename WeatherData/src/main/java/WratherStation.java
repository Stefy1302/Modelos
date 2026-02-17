/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import Subjects.WeatherData;
import Displays.*;

public class WratherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        PressureDisplay pDisplay = new PressureDisplay(weatherData);
        HeatIndexDisplay hDisplay = new HeatIndexDisplay(weatherData);

        System.out.println("--- Primera actualización (Todos avisados) ---");
        weatherData.setMeasurements(25, 65, 1013);

        System.out.println("\n--- Quitamos el display de presión ---");
        weatherData.removeObserver(pDisplay);

        System.out.println("--- Segunda actualización (Solo índice de calor avisado) ---");
        weatherData.setMeasurements(30, 70, 1012);
    }
}