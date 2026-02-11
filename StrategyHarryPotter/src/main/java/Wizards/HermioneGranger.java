/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Wizards;

import Spells.SpellWingardiumLeviosa;

public class HermioneGranger extends Wizard {

    public HermioneGranger(String name) {
        super(name);
        SpellBehavior = new SpellWingardiumLeviosa();
    }

    @Override
    public void display() {
        System.out.println("\nI am " + getName() + " and I am a wizard!");
    }
}