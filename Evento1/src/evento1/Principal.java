package evento1;
 
import java.awt.Button;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Principal {
    JFrame ventana;
     private static class ButtonPanel {

        public ButtonPanel() {
        }
    }
   
    
              
    public void go(){
        
      ButtonPanel mipanel = new ButtonPanel();
       ventana = new JFrame("titulo");
       ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       ventana.getContentPane().add(mipanel);
       ventana.setSize(300, 300);
       ventana.setVisible(true);
     
      
      
      
    }
 public static void main(String[] args) {
      Principal p= new Principal();
      p.go();
   
}
}
   
    
        
       
    


