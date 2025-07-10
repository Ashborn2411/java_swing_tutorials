import java.awt.Color;
import java.awt.Graphics;
import java.security.SecureRandom;
import javax.swing.JPanel;

public class DrawPanel extends JPanel {
    private SecureRandom randomNumbers = new SecureRandom();
    private MyLine[] lines; // array of lines

    // Constructor, creates a panel with random shapes
    public DrawPanel() {
        setBackground(Color.WHITE);

        lines = new MyLine[5 + randomNumbers.nextInt(5)];

        // Create lines
        for (int count = 0; count < lines.length; count++) {
            // Generate random coordinates
            int x1 = randomNumbers.nextInt(300);
            int y1 = randomNumbers.nextInt(300);
            int x2 = randomNumbers.nextInt(300);
            int y2 = randomNumbers.nextInt(300);

            // Generate a random color
            Color color = new Color(randomNumbers.nextInt(256),
                    randomNumbers.nextInt(256),
                    randomNumbers.nextInt(256));

            // Add the line to the list of lines to be displayed
            lines[count] = new MyLine(x1, y1, x2, y2, color);
        }
    }

    // Draw the lines
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw the lines
        for (MyLine line : lines) {
            line.draw(g);
        }
    }
}
