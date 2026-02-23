
import Platforms.*;
import Contents.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MyM
 */
public class SocialBridgeApp {
    public static void main(String[] args) {
        
        PublicationPlatform instagram = new Instagram();
        PublicationPlatform tiktok = new TikTok();
        PublicationPlatform xPlatform = new XPlatform();
        PublicationPlatform youtube = new YouTube();

        Content photo = new Photo(instagram);
        Content video = new ShortVideo(tiktok);
        Content story = new Story(youtube);
        Content thread = new ThreadContent(xPlatform);

        System.out.println("--- Test 1: Photo on Instagram ---");
        photo.processPublication();

        System.out.println("\n--- Test 2: Video on TikTok ---");
        video.processPublication();

        System.out.println("\n--- Test 3: Story on YouTube ---");
        story.processPublication();

        System.out.println("\n--- Test 4: Thread on X ---");
        thread.processPublication();

        System.out.println("\n--- Test 5: Dynamic Change (Moving Video from TikTok to YouTube) ---");
        
        System.out.print("Before: ");
        video.processPublication(); 
        
        video.setPlatform(youtube); 
        
        System.out.print("After: ");
        video.processPublication();
    }
}