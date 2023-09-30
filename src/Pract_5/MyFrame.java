package Pract_5;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class MyFrame extends JFrame{
    public MyFrame()
    {
        setSize(600,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JButton b = new JButton("Hi");
        b.addActionListener( add_New ->
                {
                    System.out.println("hi");
                }
        );
        getContentPane().add(b);
        setVisible(true);
    }
}
