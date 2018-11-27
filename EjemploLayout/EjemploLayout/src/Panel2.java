/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Guillermo
 */
import javax.swing.*;
import java.awt.*;
public class Panel2 {

     public static void main(String[] args) {
        Panel2 gui = new Panel2();
        gui.go();
     }
     public void go() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        //Panel sin layout.
        panel.setLayout(null);
        JButton button = new JButton("click");
        //Coordenadas del boton 1 x=10, y=10 ancho=70, alto=50
        button.setBounds(10, 10, 70, 50);
        panel.setBackground(Color.darkGray);
        panel.add(button);
        panel.setBounds(10, 10 , 100, 100);
        frame.getContentPane().setLayout(null);
        frame.getContentPane().add(panel);
        
        JButton button2 = new JButton("click2");
        //Coordenadas x=10, y=10 ancho=70, alto=50
        button2.setBounds(10, 120, 70, 50);
        frame.getContentPane().add(button2);
        frame.setSize(300, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
