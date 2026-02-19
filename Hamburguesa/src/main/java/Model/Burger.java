/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Model;

import java.util.List;

public class Burger {
    private final String breadType;
    private final String meatType;
    private final String cheese;
    private final List<String> extras;

    public Burger(String breadType, String meatType, String cheese, List<String> extras) {
        this.breadType = breadType;
        this.meatType = meatType;
        this.cheese = cheese;
        this.extras = extras;
    }

    @Override
    public String toString() {
        return "Burger [Bread=" + breadType + ", Meat=" + meatType + 
               ", Cheese=" + cheese + ", Extras=" + extras + "]";
    }
}