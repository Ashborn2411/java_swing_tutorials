import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawRainbow extends JPanel {

    // Define indigo and violet colors
    private final static Color VIOLET = new Color(128, 0, 128);
    private final static Color INDIGO = new Color(75, 0, 130);

    // Colors to use in the rainbow, starting from the innermost
    // The two white entries result in an empty arc in the center
    private Color[] colors = {
            Color.WHITE, Color.WHITE, VIOLET, INDIGO, Color.BLUE,
            Color.GREEN, Color.YELLOW, Color.ORANGE, Color.RED
    };

    // Constructor
    public DrawRainbow() {
        setBackground(Color.WHITE); // Set the background to white
    }

    // Draws a rainbow using concentric arcs
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        int radius = 20; // Radius of an arc

        // Draw the rainbow near the bottom-center
        int centerX = getWidth() / 2;
        int centerY = getHeight() - 10;

        // Draws filled arcs starting with the outermost
        for (int counter = colors.length; counter > 0; counter--) {
            // Set the color for the current arc
            g.setColor(colors[counter - 1]);

            // Fill the arc from 0 to 180 degrees
            g.fillArc(centerX - counter * radius,
                    centerY - counter * radius,
                    counter * radius * 2,
                    counter * radius * 2, 0, 180);
        }
    }
}
