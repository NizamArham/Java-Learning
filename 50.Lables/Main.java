import java.awt.Color;
import java.awt.Font;
import java.awt.Label;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Main {
    
    public static void main(String[] args) {
        

        //JLabel = a GUI display area for a string of text,  an image , or both


        ImageIcon imageIcon = new ImageIcon("Dude.png");



        JLabel jLabel = new JLabel();// create a label
        jLabel.setText("Bro Do you even text??"); // set text of label
        jLabel.setIcon(imageIcon);
        jLabel.setHorizontalTextPosition(SwingConstants.LEFT); //set text Left,Center,right of image icon
        jLabel.setVerticalTextPosition(SwingConstants.TOP); //set text Top, center, bottom of image icon
        //jLabel.setForeground(new Color());
        jLabel.setFont(new Font ("Mv Boli", Font.PLAIN,20)); // set font of text
        jLabel.setIconTextGap(-22); // set gaps between Text and image
        jLabel.setBackground(Color.black);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(5000, 5000);
        frame.setVisible(true);
        //frame.setResizable(false);
        frame.add(jLabel);

    }
}
