import javax.swing.JFrame;
import javax.swing.ImageIcon;

import java.awt.Color;


public class MyFrame extends JFrame {

    MyFrame () {

        this.setTitle("Nizam"); // Title of the frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out if application
        this.setResizable(false); // prevent frame from being resize
        this.setSize(420, 420); // size of the frame
        this.setVisible(true); //make frame visible

        // ImageIcon image = new ImageIcon("logo.png"); //create an ImageIcon
        // frame.setIconImage(image.getImage()); // change icon of the frame

        this.getContentPane().setBackground(new Color(255,25,85)); // change the color of background
    }
    
}
