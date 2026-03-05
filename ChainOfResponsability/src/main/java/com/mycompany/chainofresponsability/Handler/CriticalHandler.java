/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chainofresponsability.Handler;
import com.mycompany.chainofresponsability.Model.*;
/**
 *
 * @author MyM
 */
public class CriticalHandler extends SupportHandler {
    @Override
    public void handleRequest(Priority priority, String message) {
        if (priority == Priority.INTERMEDIATE) {
            System.out.println("[Nivel 2 - Técnico] Atendiendo: " + message);
        } else if (next != null) {
            next.handleRequest(priority, message);
        }
    }
}