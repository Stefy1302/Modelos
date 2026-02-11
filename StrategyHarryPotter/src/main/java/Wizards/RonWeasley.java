/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Wizards;

import Spells.SpellExpelliarmus;

public class RonWeasley extends Wizard {

    public RonWeasley(String name) {
        super(name);
        SpellBehavior = new SpellExpelliarmus();
    }

    @Override
    public void display() {
        System.out.println("\nI am " + getName() + " and I am a wizard!");
    }
}