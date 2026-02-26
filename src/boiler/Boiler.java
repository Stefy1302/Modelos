/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boiler;

/**
 *
 * @author Estudiantes
 */
public class Boiler {
    private boolean empty;
    private boolean heaterOn;
    private static Boiler instance;

    private Boiler(){
        empty = true;
        heaterOn = false;
    }

    public static Boiler getInstance() {
        if (instance == null){
            instance = new Boiler();
            System.out.println("Instance created for the first time.");
        }
        return instance;
    }

    public void fill (){
        if (!isEmpty() && !isHeaterOn()){
            empty = false;
            System.out.println("Filling the boiler");
        }else{     
            System.out.println("The boiler cannot be filled, it is already full, or the heating element is off.");         
        }  
    }
    public void boil (){
        if (!isEmpty() && !isHeaterOn()){
            heaterOn = true;
            System.out.println("Heating element on, heating the mixture.");
        }else{     
            System.out.println("It won't heat up, the boiler is empty and it's on.");         
        }  
    }

    public void drain (){
        if (!isEmpty() && !isHeaterOn()){
            heaterOn = false;
            empty = true;
            System.out.println("Boiler full and heating element on, starting drain.");
        }else{     
            System.out.println("It cannot be drained, the boiler is empty or the heating element is off.");         
        }  
    }

    private boolean isEmpty() {
        return empty;
    }

    private boolean isHeaterOn() {
        return heaterOn;
    }

    static class getInstance extends Boiler {

        public getInstance() {
        }
    }
    
}
