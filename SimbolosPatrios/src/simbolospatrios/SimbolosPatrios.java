
package simbolospatrios;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;
import javax.swing.Icon;
import javax.swing.ImageIcon;
public class SimbolosPatrios implements ActionListener{

        JButton pintarBandera, borrarBandera ,Bandera; 
        JDialog ventana;
        Icon Escudo, Himno;

    public static void main(String[] args) {
         SimbolosPatrios Tarea= new SimbolosPatrios();
         Tarea.inicializar();

    }
    private void inicializar() {
         ventana = new JDialog();
         ventana.setTitle("Simbolos Patrios");//nombre de JDialogo
         ventana.setLayout(null);//colocar el layout en nulo
         ventana.setSize(680, 690);//colocar tamaño a la ventana
         ventana.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE );//cerrar la ventana
         
         pintarBandera = new JButton("Pintar Bandera");
         pintarBandera.setBackground(Color.LIGHT_GRAY);
         pintarBandera.setBounds(370, 620, 150, 25);
         pintarBandera.setToolTipText("¡¡Se pintara la Bandera");
         pintarBandera.addActionListener(this);
         
         borrarBandera = new JButton("Borrar Bandera");
         borrarBandera.setBackground(Color.LIGHT_GRAY);
         borrarBandera.setBounds(50, 620, 150, 25);
         borrarBandera.setToolTipText("¡¡Se borrara la Bandera");
         borrarBandera.addActionListener(this);
         
         
         Bandera = new JButton(new ImageIcon("src/simbolospatrios/bandera2.png"));
         Bandera.setBounds(5, 5, 650, 600);
         Bandera.setToolTipText("¡¡Bandera de Colombia");
 
         ventana.add(borrarBandera);
         ventana.add(pintarBandera);
         ventana.add(Bandera);
         
         ventana.setVisible(true);
         ventana.setLocationRelativeTo(null);//cebtrar el JDialog
        
         Escudo = new ImageIcon("src/simbolospatrios/Escudo.png");
         Himno= new ImageIcon("src/simbolospatrios/Himno.png");
         
         SimbolosPatrios.Mouse objeto = new SimbolosPatrios.Mouse();
         ventana.addMouseListener(objeto);
        
    }
    private class Mouse implements MouseListener{

        @Override
        public void mouseClicked(MouseEvent me) {
            
            if(me.isMetaDown()){
                JOptionPane.showMessageDialog(null," ", "HIMNO",JOptionPane.WARNING_MESSAGE ,Himno);
            } else if(me.isAltDown()){
                JOptionPane.showMessageDialog(null," ","ESCUDO",JOptionPane.WARNING_MESSAGE,Escudo);
                    }

        }

        @Override
        public void mousePressed(MouseEvent me) {
            
        }

        @Override
        public void mouseReleased(MouseEvent me) {
        }

        @Override
        public void mouseEntered(MouseEvent me) {
            
        }

        @Override
        public void mouseExited(MouseEvent me) {
            
        }
            
        }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()== pintarBandera){
            Bandera.setVisible(true);
           
            
        }
        if(ae.getSource()== borrarBandera){
            Bandera.setVisible(false);
        }
        
    }
}

