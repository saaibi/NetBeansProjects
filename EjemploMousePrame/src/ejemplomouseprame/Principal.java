

import javax.swing.JFrame;


public class Principal {
     public static void main( String args[] ){ 
      MouseFrame mouseFrame = new MouseFrame(); 
      mouseFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      mouseFrame.setSize( 300, 300 ); // tamaño de frame 
      mouseFrame.setVisible( true ); // mostrar frame
      mouseFrame.setLocationRelativeTo(null);//centrar frame
   } 
}
