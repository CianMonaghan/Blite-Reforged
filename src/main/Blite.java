package main;
import javax.swing.SwingUtilities;

/**
 * Blite Reforged
 * 
 * A Dungeons and Dragons Character Sheet Creator for 5th Edition
 * @author Cian Monaghan
 * @version 0.0.2
 */
public class Blite {
    /**
     * Main function that creates a window that prints Hello World
     * @param args blank
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Window window = new Window("Blite Reforged", "Hello World");
            window.setVisible(true);
        });
    }
}