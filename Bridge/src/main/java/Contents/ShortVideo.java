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
public class ShortVideo extends Content {
    public ShortVideo(PublicationPlatform platform) {
        super(platform);
    }

    @Override
    public void processPublication() {
        platform.publish("15-second clip with trending audio");
    }
}