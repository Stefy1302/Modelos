/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chainofresponsability.Model;

/**
 *
 * @author MyM
 */
public class SupportRequest {
    private final Priority priority;
    private final String message;

    public SupportRequest(Priority priority, String message) {
        this.priority = priority;
        this.message = message;
    }

    // Getters para que los Handlers puedan consultar la información
    public Priority getPriority() {
        return priority;
    }

    public String getMessage() {
        return message;
    }
}