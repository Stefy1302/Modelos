/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Platforms;

/**
 *
 * @author MyM
 */
public class Instagram implements PublicationPlatform {
    @Override
    public void publish(String formattedContent) {
        System.out.println("[Instagram] Publishing visual post: " + formattedContent);
    }
}
