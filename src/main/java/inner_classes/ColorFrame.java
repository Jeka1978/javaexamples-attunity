package inner_classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Evgeny Borisov
 */
public class ColorFrame extends JFrame {

     class Leaf {
    }


    public ColorFrame(final int counter[]) {

        setSize(700, 700);

        JButton button = new JButton("click to change color");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getContentPane().setBackground(Color.RED);
                System.out.println("counter = " + counter[0]++);
            }
        });

        this.getContentPane().add(button, BorderLayout.NORTH);

        setVisible(true);


    }

    public static void main(String[] args) {
        ColorFrame colorFrame = new ColorFrame(new int[]{10});
    }
}


