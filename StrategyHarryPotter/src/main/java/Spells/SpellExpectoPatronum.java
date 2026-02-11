/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
/**
 *
 * @author MyM
 */
package Spells;

public class SpellExpectoPatronum implements SpellBehavior {

    @Override
    public void castSpell() {
        System.out.println("You cast Expecto Patronum! A flash of light summons a Patronus to defend against Dementors.");
    }
}