import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class RandomShapes extends JFrame {
    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;

    private Shape[] shapes;

    public RandomShapes() {
        setTitle("СЛУЧАЙНЫЕ ФИГУРЫ");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        shapes = generateRandomShapes(20);

        setVisible(true);
    }

    private Shape[] generateRandomShapes(int count) {
        Random random = new Random();
        Shape[] shapes = new Shape[count];

        for (int i = 0; i < count; i++) {
            int shapeType = random.nextInt(2); // 0 - Rectangle, 1 - Circle
            Color color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
            int x = random.nextInt(WIDTH);
            int y = random.nextInt(HEIGHT);

            if (shapeType == 0) {
                int width = random.nextInt(100) + 50;
                int height = random.nextInt(100) + 50;
                shapes[i] = new Rectangle(color, x, y, width, height);
            } else {
                int radius = random.nextInt(50) + 25;
                shapes[i] = new Circle1(color, x, y, radius);
            }
        }

        return shapes;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        for (Shape shape : shapes) {
            shape.draw(g);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(RandomShapes::new);
    }
}
