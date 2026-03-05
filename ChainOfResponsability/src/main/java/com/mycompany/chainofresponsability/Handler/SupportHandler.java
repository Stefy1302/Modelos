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
public abstract class SupportHandler {
    protected SupportHandler next; 

    public void setNext(SupportHandler next) {
        this.next = next;
    }

    public abstract void handleRequest(Priority priority, String message);
}