package main;
import javax.swing.SwingUtilities;

/**
 * Blite Reforged
 * 
 * A Dungeons and Dragons Character Sheet Creator for 5th Edition
 * @author Cian Monaghan
 * @version 0.0.3
 */
public class Blite {
    /**
     * Main function
     * <p>
     * Creates window that has image box on top with red border and "Hello World" on bottom
     * 
     * @param args blank
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Window window = new Window("Blite Reforged", "Hello World");
            window.setVisible(true);
        });
    }
}