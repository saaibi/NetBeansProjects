
package ejemplojdialog;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.Container;
import java.awt.BorderLayout;

public class EjemploJDialog {
         
       JFrame ventanaPadre;
       JDialog VentanaSegundaria;
       JTextArea label;
       
    public static void main(String[] args) {
        EjemploJDialog principal = new EjemploJDialog(); //crear un objeto de la clase Taller2
        principal.inicializar();  
        
    }

    private EjemploJDialog() {
        
    }


    private void inicializar() {
        JFrame VentanaPadre;
        JDialog VentanaSegundaria;
        
        VentanaPadre= new JFrame("Ventana principal");
        VentanaPadre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        VentanaPadre.setSize(300, 300);
        VentanaPadre.setVisible(true);
        VentanaPadre.setLocationRelativeTo(null);
        VentanaPadre.setResizable(false);
        
        
        
        
        VentanaSegundaria = new JDialog(VentanaPadre ,"",true);
        VentanaSegundaria.setResizable(true);
        VentanaSegundaria.setTitle("ventana segundaria");
        JTextArea label = new JTextArea("Este programa fue disenado por: \n"+ "El padre\n"+"como elemplo de uns de dialogos\n"+ "2015\n");

         Container contenPane = VentanaSegundaria.getContentPane();
         contenPane.add(label, BorderLayout.CENTER);
         VentanaSegundaria.setSize(400, 400);
         VentanaSegundaria.setVisible(true);
        VentanaSegundaria.setLocationRelativeTo(null);
     
        
        
        
        
        
        
        
    }
        
       
       
    
    
    
    
}
       
    
    

