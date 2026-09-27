package main;
import javax.swing.*;
import java.awt.*;
import java.net.URL;
/**
 * Window
 * 
 * Creates a window using Swing
 * @author Cian Monaghan
 */

public class Window extends JFrame{
    /**
     * Creates a window frame in the middle of the screen with the inputted text
     * 
     * @param windowName name of the window
     * @param windowText what appears inside the window
     */
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
