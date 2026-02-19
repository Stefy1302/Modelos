/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Builder;

/**
 *
 * @author MyM
 */

import Model.Burger;
import java.util.ArrayList;
import java.util.List;

public class BurgerBuilder {
    private String breadType;
    private String meatType;
    private String cheese = "No cheese";
    private List<String> extras = new ArrayList<>();

    public BurgerBuilder(String breadType, String meatType) {
        this.breadType = breadType;
        this.meatType = meatType;
    }

    public BurgerBuilder withCheese(String cheese) {
        this.cheese = cheese;
        return this;
    }

    public BurgerBuilder addExtra(String extra) {
        this.extras.add(extra);
        return this;
    }

    public Burger build() {
        return new Burger(breadType, meatType, cheese, extras);
    }
}