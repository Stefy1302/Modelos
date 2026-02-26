/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boiler;

/**
 *
 * @author Estudiantes
 */
public class  Main{
    public static void main(String[] args) {
        Boiler boiler = new Boiler.getInstance();
        
        boiler.fill();
        boiler.boil();
        boiler.drain();
    }
}
