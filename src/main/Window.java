package main;
/**
 * Window
 * 
 * Creates a window using Swing
 */

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class Window extends JFrame{
    public Window(String windowName, String windowText) {
        SwingUtilities.invokeLater(() -> {
            setTitle(windowName);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            //Loads Blite logo as app icon
            URL iconURL = Window.class.getResource("/resources/images/Blite_Logo_Transparent.png");
            if(iconURL != null){
                ImageIcon icon = new ImageIcon(iconURL);
                setIconImage(icon.getImage());
            } else{
                System.err.println("Could not find image file");
            }

            //text
            JLabel label = new JLabel(windowText);
            add(label);
            
            setMinimumSize(new Dimension(600, 600));
            pack();
            setLocationRelativeTo(null);
        });
    }
}
