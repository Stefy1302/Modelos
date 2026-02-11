/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import Spells.*;
import Wizards.*;

public class Main {
    public static void main(String[] args) {
        Wizard harry = new HarryPotter("Harry Potter");
        Wizard hermione = new HermioneGranger("Hermione Granger");
        Wizard ron = new RonWeasley("Ron Weasley");

        harry.display();
        harry.performSpells();

        hermione.display();
        hermione.performSpells();

        ron.display();
        ron.performSpells();

            // Changing Hermione's Spells at runtime
        hermione.setSpellBehavior(new SpellOculusReparo());

        hermione.display();
        hermione.performSpells();

    }
}