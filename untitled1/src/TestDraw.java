import javax.swing.JFrame;

public class TestDraw {
    public static void main(String[] args) {
        DrawPanel panel = new DrawPanel();
        JFrame frame = new JFrame("Random Lines Drawing");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}
