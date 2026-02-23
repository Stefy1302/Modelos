/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Platforms;

/**
 *
 * @author MyM
 */
public class TikTok implements PublicationPlatform {
    @Override
    public void publish(String formattedContent) {
        System.out.println("[TikTok] Uploading short video: " + formattedContent);
    }
}