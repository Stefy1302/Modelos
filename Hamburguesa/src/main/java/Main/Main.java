/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;
import Builder.BurgerBuilder;
import Model.Burger;

public class Main {
    public static void main(String[] args) {
        Burger simpleBurger = new BurgerBuilder("White", "Beef")
                                    .build();

        Burger specialBurger = new BurgerBuilder("Brioche", "Angus")
                                    .withCheese("Cheddar")
                                    .addExtra("Bacon")
                                    .addExtra("Caramelized Onion")
                                    .build();

        System.out.println(simpleBurger);
        System.out.println(specialBurger);
    }
}