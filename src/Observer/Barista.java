/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Observer;
import Interface.*;
/**
 *
 * @author Estudiantes
 */
public class Barista implements BaristaObserver {
    private final String name;
    private final int id;
    
    public Barista(String name, int id){
        this.name = name;
        this.id = id;
    }
    
    @Override
    public void update(String varietal,String notes,String origin,int altitude,String producer,int quantity){
        System.out.println("\nNotification for Barista "+ name + ", with id " +id+"\nNew "+ varietal + " is avaible, from producer "
                + producer + " produced in " + origin + " at an altitude " + altitude + " msnm. \nImportant notes: "
                + notes + "\nquantity: " + quantity + " lbs\n");
    }
}
