
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author SAAIBI
 */
public class Principal{
    
    public static void main(String[] args) {
        String numero1=JOptionPane.showInputDialog(null, "Ingrese un número", "Ingresar dato", JOptionPane.INFORMATION_MESSAGE);
        String numero2=JOptionPane.showInputDialog(null, "Ingrese otro número", "Ingresar dato", JOptionPane.QUESTION_MESSAGE);
        
        int resultado=Integer.parseInt(numero1) + Integer.parseInt(numero2);
        
        JOptionPane.showMessageDialog(null, "El resultado Es:"+resultado, "Resultado", JOptionPane.WARNING_MESSAGE);        
        
        JFrame ventana=new JFrame();
        JButton boton=new JButton("Click me ");        
        ventana.getContentPane().add(boton);        
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
        ventana.setSize(200, 200);
        ventana.setVisible(true);
        
        
        
    }
}
