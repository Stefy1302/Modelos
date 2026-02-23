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
public abstract class Content {
    protected PublicationPlatform platform; 

    public Content(PublicationPlatform platform) {
        this.platform = platform;
    }

    public void setPlatform(PublicationPlatform platform) {
        this.platform = platform;
    }

    public abstract void processPublication();
}