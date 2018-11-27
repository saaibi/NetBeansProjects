
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Ventana {
    JFrame ventanita;
    JButton bmover;
    int posicion;
    
     public static void main(String[] args) {
        Ventana principal=new Ventana();
        principal.iniciar();
     }

    private void iniciar() {
        MiPanel mp=new MiPanel();
        ventanita=new JFrame("EJEMPLO EVENTOS");
        bmover=new JButton("Mover");
        posicion=0;
        
        bmover.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                ventanita.getContentPane().remove(bmover);
                
                if (posicion==0){
                ventanita.getContentPane().add(bmover,BorderLayout.SOUTH);
                ventanita.setSize(301, 301);
                ventanita.setLocation(200, 200);                
                posicion=1;
                }
                else{
                ventanita.getContentPane().add(bmover,BorderLayout.NORTH);
                ventanita.setSize(300, 300);
                ventanita.setLocation(0, 0);                
                posicion=0;
                } 
                    
            }
        });
        
        ventanita.getContentPane().add(mp,BorderLayout.CENTER);
        ventanita.getContentPane().add(bmover,BorderLayout.NORTH);
        ventanita.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventanita.setSize(300, 300);
        ventanita.setVisible(true);
        
        
    }
    
}
