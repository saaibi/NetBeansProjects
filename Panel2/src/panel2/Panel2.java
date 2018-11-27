
package panel2;

import java.awt.*;
import javax.swing.*;


public class Panel2 {

   
    public static void main(String[] args) {
      Panel2 gui = new Panel2();
      gui.go();
    }

    private void go() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
            // panel sin layou
        panel.setLayout(null);
        JButton button = new JButton("hola");
        // cordenadas de 1 X=10, y=10  ancho=70, alto=50
        button.setBounds(10, 10, 70, 50);
        panel.setBackground(Color.DARK_GRAY);
        panel.add(button);
        panel.setBounds(10, 10, 100, 100);
        frame.getContentPane().setLayout(null);
        frame.getContentPane().add(panel);
             
        JButton button2 = new JButton("click");
            // cordrnadas X=10, y=120, ancho70, alto=50
        button2.setBounds(10, 120, 70, 50);
        frame.getContentPane().add(button2);
        frame.setSize(300, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    
}
