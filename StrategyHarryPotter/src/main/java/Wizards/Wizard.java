/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Wizards;

import Spells.SpellBehavior;

public abstract class Wizard{

    protected SpellBehavior SpellBehavior;
    private String name;

    public void performSpells() {
        SpellBehavior.castSpell();
    }

    public Wizard(String name) {
        this.name = name;
    }

    public abstract void display();

    public String getName() {
        return name;
    }

    public void setSpellBehavior(SpellBehavior sb) {
        this.SpellBehavior = sb;
    }
}