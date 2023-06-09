import java.io.File;
import java.io.IOException;
import javax.sound.sampled.*;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class main {
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException{
    
        Scanner scanner = new Scanner(System.in);
        try {
            File file = new File("KaariNa.wav");
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            
            
            String response = "";

            while (!response.equals("Q")) {

                System.out.println("P = Play, S = Stop, R = Reset, Q = Quit");
                System.out.print("Enter Your Choice :");
                
                response = scanner.next();
                response = response.toUpperCase();

                switch (response) {
                    case ("P"): clip.start();
                        break;
                    case ("S"): clip.stop();
                        break;
                    case ("R"): clip.setMicrosecondPosition(0);
                        break;
                    case ("Q"): clip.close();
                        break;
                    default:
                    System.out.println("Not a Valid response");
                        break;
                }
            }

            System.out.println("Bye!!!");

        } catch (IOException | UnsupportedAudioFileException | LineUnavailableException e) {
            System.out.println(e.getMessage());
        }


    }
}