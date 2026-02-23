 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import Observer.Barista;
import Subject.CoffeCooperative;
/**
 *
 * @author Estudiantes
 */
public class Main {
    public static void main(String[] args){
        CoffeCooperative cooperative = new CoffeCooperative();
        
        Barista barist1 = new Barista("Alan", 54);
        Barista barist2 = new Barista("Dan", 50);
        
        cooperative.suscribe(barist2);
        cooperative.suscribe(barist1);
        
        cooperative.registerNewLot("Pink bourbon"," Red fruits, caramel, medium-high cidity", "Acevedo huila", 1250, "Peter Gomez", 45);
        
        cooperative.unsuscribe(barist1);
        
        cooperative.registerNewLot("Geisha","Jasmine and citrus notes", "Quindio", 1800, "Yeremi salazar", 20);
    }
}
