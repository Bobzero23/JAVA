package exercises.exercise11;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class GUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLayout(null);

        JPanel panel = new JPanel();
        panel.setBorder(new LineBorder(Color.BLACK, 1));
        panel.setBounds(2, 10, 600, 400);

        JButton text = new JButton("Text");
        text.setBounds(20, 420, 60, 30);
        text.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Graphics2D gr = (Graphics2D) panel.getGraphics();
                int x, y;
                x = (int) (550 * Math.random());
                y = (int) (380 * Math.random());
                Font font = new Font("Garamond", Font.ITALIC, 36);
                gr.setFont(font);
                gr.drawString("Some Text", x, y);
            }
        });

        JButton image = new JButton("Image");
        image.setBounds(150, 420, 100, 30);
        image.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Graphics2D gr = (Graphics2D) panel.getGraphics();
                BufferedImage img = null;
                try {
                    img = ImageIO.read(new File("win2000.jpg")); // Replace with your image file path
                } catch (IOException ex) {
                    System.out.println("Error on opening file");
                    return;
                }
                int x, y;
                x = (int) (550 * Math.random());
                y = (int) (380 * Math.random());
                gr.drawImage(img, x, y, null);
            }
        });


        JButton lines = new JButton("Lines");
        lines.setBounds(300, 420, 100, 30);
        lines.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Graphics2D gr = (Graphics2D) panel.getGraphics();
                int x1, y1, x2, y2;
                x1 = (int) (550 * Math.random());
                y1 = (int) (380 * Math.random());
                x2 = (int) (550 * Math.random());
                y2 = (int) (380 * Math.random());
                BasicStroke stroke = new BasicStroke(5);
                gr.setStroke(stroke);
                gr.setColor(Color.blue);
                gr.drawLine(x1, y1, x2, y2);
            }
        });

        JButton rectangles = new JButton("Rectangles");
        rectangles.setBounds(470, 420, 100, 30);
        rectangles.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Graphics2D gr = (Graphics2D) panel.getGraphics();
                int x, y, width, height;
                x = (int) (550 * Math.random());
                y = (int) (380 * Math.random());
                width = (int) (200 * Math.random());
                height = (int) (200 * Math.random());
                gr.drawRect(x, y, height, width);
                x = (int) (550 * Math.random());
                y = (int) (380 * Math.random());
                width = (int) (200 * Math.random()) + 30;
                height = (int) (200 * Math.random()) + 30;
                gr.drawRoundRect(x, y, height, width, 20, 20);
            }
        });

        JButton ellipses = new JButton("Ellipses");
        ellipses.setBounds(20, 480, 100, 30);
        ellipses.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Graphics2D gr = (Graphics2D) panel.getGraphics();
                int x, y, width, height;
                x = (int) (550 * Math.random());
                y = (int) (380 * Math.random());
                width = (int) (200 * Math.random());
                height = (int) (200 * Math.random());
                gr.drawOval(x, y, width, height);
            }
        });

        JButton fill = new JButton("Fill");
        fill.setBounds(150, 480, 70, 30);
        fill.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Graphics2D gr = (Graphics2D) panel.getGraphics();
                int x, y, width, height, R, G, B;
                x = (int) (550 * Math.random());
                y = (int) (380 * Math.random());
                width = (int) (200 * Math.random());
                height = (int) (200 * Math.random());
                R = (int) (255 * Math.random());
                G = (int) (255 * Math.random());
                B = (int) (255 * Math.random());
                gr.setColor(new Color(R, B, G));
                gr.fillRect(x, y, width, height);

                x = (int) (550 * Math.random());
                y = (int) (380 * Math.random());
                width = (int) (200 * Math.random());
                height = (int) (200 * Math.random());
                R = (int) (255 * Math.random());
                G = (int) (255 * Math.random());
                B = (int) (255 * Math.random());
                gr.setColor(new Color(R, B, G));
                gr.fillOval(x, y, width, height);
            }
        });


        JButton clear = new JButton("Clear");
        clear.setBounds(630, 480, 100, 30);
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Graphics2D gr = (Graphics2D) panel.getGraphics();
                gr.clearRect(0, 0, 600, 400);
                panel.setBorder(new LineBorder(Color.BLACK, 1));
            }
        });


        frame.add(text);
        frame.add(image);
        frame.add(lines);
        frame.add(rectangles);
        frame.add(panel);
        frame.add(ellipses);
        frame.add(fill);
        frame.add(clear);
        frame.setVisible(true);
    }
}
