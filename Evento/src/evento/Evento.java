package evento;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.*;


public class Evento implements ActionListener{
    JButton button;
        
    public static void main(String[] args) {
        Evento gui = new Evento();
       gui.go();
        
      }
    
    public void go() {
        JFrame frame = new JFrame();
        button = new JButton("bienvenida");
        
        button.addActionListener((ActionListener) this);

        
       frame.getContentPane().add(button);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(300, 300);
       frame.setVisible(true);
       
    }

    @Override
    public void actionPerformed(ActionEvent event) {
               
        button.setText("hola mundo");
    }
}
