import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;


/**
 *
 * @author UnTalJohanPerez
 */
public class MouseEvento implements MouseListener, MouseMotionListener {

    JFrame frame;
    JPanel panel;
    JLabel label;
  
    
    
    public static void main(String[] args) {
        
        MouseEvento gui = new MouseEvento();  
        gui.go();
  


    }

    public void go(){
     
    frame = new JFrame();
    frame.setTitle("MouseEvento");
    frame.setSize(600,600);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLayout(null);
    
    
    
    panel = new JPanel();
    panel.setLayout(null);
    panel.setBounds(0, 0, 500, 500);
    panel.setBackground(Color.white);
    panel.addMouseListener(this);
    
    label = new JLabel("Mouse Fuera del JPanel");
    label.setBounds(220, 501, 600, 50);
    
    
    
    frame.getContentPane().add(panel);
    frame.getContentPane().add(label);
   
    frame.setVisible(true);

    }
            
    
    @Override
    public void mouseClicked(MouseEvent me) {
        panel.setBackground(Color.yellow);
        label.setText(String.format("click en: (%d , %d)", me.getX(),me.getY()));
 
        
        
       // System.out.println(me.getLocationOnScreen());
       // label.setText(me.getLocationOnScreen().toString());
    }

    @Override
    public void mousePressed(MouseEvent me) {
       panel.setBackground(Color.yellow);
        label.setText(String.format("presiono en: (%d , %d)", me.getX(),me.getY()));
    }

    @Override
    public void mouseReleased(MouseEvent me) {
        panel.setBackground(Color.yellow);
       label.setText(String.format("solto en: (%d , %d)", me.getX(),me.getY()));
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        panel.setBackground(Color.yellow);
        label.setText(String.format("entro en: (%d , %d)", me.getX(),me.getY()));
    }

    @Override
    public void mouseExited(MouseEvent me) {
        panel.setBackground(Color.yellow);
        label.setText(String.format("salio en: (%d , %d)", me.getX(),me.getY()));
    }

    @Override
    public void mouseDragged(MouseEvent me) {
       // panel.setBackground(Color.yellow);
       // label.setText(String.format("entro en: (%d , %d)", me.getX(),me.getY()));
    }

    @Override
    public void mouseMoved(MouseEvent me) {
        
    }
    
}