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
public class Photo extends Content {
    public Photo(PublicationPlatform platform) {
        super(platform);
    }

    @Override
    public void processPublication() {
        platform.publish("High-resolution photography with filters");
    }
}