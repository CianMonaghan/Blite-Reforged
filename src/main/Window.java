package main;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.net.URL;
/**
 * Window
 * 
 * Creates a window using Swing
 * @author Cian Monaghan
 */

public class Window extends JFrame{
    //Constants
    /**
     * Formatting layout for Window
     * <p>
     * Version 0.0.3 - Grid Layout
     * <p>
     * TODO: Change this to a GridBagLayout
     */
    GridLayout LAYOUT = new GridLayout(2,2,10,10);
    
    /**
     * Blite Border Color
     */
    Color BLITE_BORDER = Color.decode("0xED1C24"); //Blite Red

    //Default theme colors
    Border border = BorderFactory.createLineBorder(BLITE_BORDER, 5);

    /**
     * Creates a window with image box on top and inputted text on bottom
     * <p>
     * Default is full-screen, can be minimized to 600x600 size
     * 
     * @param windowName name of the window
     * @param windowText text that appears inside the window below the photo
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

            setLayout(LAYOUT); //note - now add everything SEQUENTALLY

            //add photo component to top left of screen
            JPanel photoPanel = new JPanel();
            TitledBorder photoPanelBorder = new TitledBorder(
                border,
                "Photo",
                TitledBorder.LEFT,
                TitledBorder.TOP
            );
            photoPanel.setBorder(photoPanelBorder);

            //adds a default photo - currently the Blite logo
            //TODO: Change this
            ImageIcon photo = null;
            if(iconURL != null){
                photo = new ImageIcon(iconURL);
            }
            JLabel label = null;
            if(photo != null){
                label = new JLabel(photo);
            } else {
                label = new JLabel("Photo not found.");
            }
            photoPanel.add(label);

            add(photoPanel);
            photoPanel.revalidate();
            photoPanel.repaint();

            //input text
            JLabel text = new JLabel(windowText);
            add(text);
            
            //min size is small box, but default load is full screen
            setMinimumSize(new Dimension(600, 600));
            pack();
            setExtendedState(JFrame.MAXIMIZED_BOTH);
            setLocationRelativeTo(null);
        });
    }
}
