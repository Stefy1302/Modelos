/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Wizards;

import Spells.SpellExpectoPatronum;

public class HarryPoter extends Wizard {

    public HarryPoter(String name) {
        super(name);
        SpellBehavior = new SpellExpectoPatronum();
    }

    @Override
    public void display() {
        System.out.println("\nI am " + getName() + " and I am a wizard!");
    }
}