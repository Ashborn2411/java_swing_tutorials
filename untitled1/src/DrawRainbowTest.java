import javax.swing.JFrame;

public class DrawRainbowTest {
    public static void main(String[] args) {
        // Create a new JFrame
        JFrame frame = new JFrame("Draw Rainbow");

        // Set the default close operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Add the DrawRainbow panel to the frame
        frame.add(new DrawRainbow());

        // Set the size of the frame
        frame.setSize(400, 400);

        // Center the frame
        frame.setLocationRelativeTo(null);

        // Make the frame visible
        frame.setVisible(true);
    }
}
