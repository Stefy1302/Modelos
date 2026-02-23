/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Subject;
import java.util.ArrayList;
import java.util.List;
import Interface.BaristaObserver;
/**
 *
 * @author Estudiantes
 */
public class CoffeCooperative {
    private final List<BaristaObserver> baristas = new ArrayList<>();
    
    public void suscribe(BaristaObserver barista){
        baristas.add(barista);
    }
    
    public void unsuscribe(BaristaObserver barista){
        baristas.remove(barista);
    }
    
    public void registerNewLot(String varietal,String notes,String origin,int altitude,String producer,int quantity){
        System.out.println("\nRegistering new lot: "+ varietal +"\nNotes: "+notes+"\nOrigin: "+origin+"\nAltitude: "
        +altitude+"\nProducer: "+producer+"\nQuntity: "+quantity);
        notifyBaristas(varietal, notes, origin, altitude, producer, quantity);
    }
    
    public void notifyBaristas(String varietal,String notes,String origin,int altitude,String producer,int quantity){
        for (BaristaObserver barista: baristas){
            barista.update(varietal, notes, origin, altitude, producer, quantity);
        }
    }
}
