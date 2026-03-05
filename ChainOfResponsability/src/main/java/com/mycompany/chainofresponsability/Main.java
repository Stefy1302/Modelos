/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.chainofresponsability;

/**
 *
 * @author MyM
 */
import com.mycompany.chainofresponsability.Model.*;
import com.mycompany.chainofresponsability.Handler.*;

public class Main {
    public static void main(String[] args) {
        SupportHandler level1 = new BasicHandler();
        SupportHandler level2 = new IntermediateHandler();
        SupportHandler level3 = new CriticalHandler();

        level1.setNext(level2);
        level2.setNext(level3);

        System.out.println("Iniciando atención al cliente...");
        
        level1.handleRequest(Priority.BASIC, "No puedo cambiar mi contraseña.");
        level1.handleRequest(Priority.INTERMEDIATE, "El software falla al exportar PDF.");
        level1.handleRequest(Priority.CRITICAL, "¡El servidor principal no enciende!");
    }
}