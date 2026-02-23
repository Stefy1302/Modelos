/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Contents;

import Platforms.PublicationPlatform;

/**
 *
 * @author MyM
 */
public class ThreadContent extends Content {
    public ThreadContent(PublicationPlatform platform) { 
        super(platform); 
    }

    @Override
    public void processPublication() { 
        platform.publish("Sequential text Thread"); 
    }
}