
package bordelayout;

import java.awt.BorderLayout;
import java.awt.Button;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class EjemplBoxLayout {

    
    public static void main(String[] args) {
        
       
         JFrame frame = new JFrame();
         JPanel panel = new JPanel();
         
         panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
         
         JButton Botton1 = new JButton("guardar");
         JButton Botton2 =  new JButton("borrar");
         JButton Botton3 = new JButton("siguiente");
         
         panel.add(Botton1);
         panel.add(Botton2);
         panel.add(Botton3);
         
          frame.getContentPane().setLayout(null); //para yo organisarlo 
          Botton1.setBounds(0, 0, 200, 300);
          frame.getContentPane().add(Botton1);
          
         
         frame.getContentPane().add(BorderLayout.EAST,panel);
         frame.setSize(300,200);
        frame.setVisible(true);
                 
         
        
        
    }
    
}
