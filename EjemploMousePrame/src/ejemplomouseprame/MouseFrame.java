
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
public class MouseFrame extends JFrame {
    private JPanel panel;// panel en el cual los eventos del mouse ocurriran
    private JLabel label;// label que despliega información de los eventos
   public MouseFrame(){
      super("Ejemplo evento  mouse ");
        panel = new JPanel(); // crear panel
        panel.setBackground(Color.blue); // colocar color de fondo
        add(panel, BorderLayout.CENTER); // adicionar panel al JFrame
         label = new JLabel("Mouse fuera del JPanel");
        add(label, BorderLayout.SOUTH); // adicionar label al JFrame
        // creaar y registrar listener para eventos del mouse y mouse motion events
        MouseFrame.MouseHandler handler = new MouseFrame.MouseHandler();
        panel.addMouseListener(handler);
        panel.addMouseMotionListener(handler);
   }
   
   
    //CLASE INTERNA 
    private class MouseHandler implements MouseListener, MouseMotionListener {
        // MouseListener event handlers
        // handle event when mouse released immediately after press

        @Override
        public void mouseClicked(MouseEvent event) {
            label.setText(String.format("Clic en: [%d, %d]",
                    event.getX(), event.getY()));
            int xPos, yPos;

            xPos = event.getX();
            yPos = event.getY();

            String titulo = "Se hizo clic " + event.getClickCount() + " Veces";

            if (event.isMetaDown()) { // botón derecho del ratón 
                titulo += " con el botón derecho del ratón";
            } else if (event.isAltDown()) { // botón de en medio del ratón
                titulo += " con el botón central del ratón";
            } else {// botón izquierdo del ratón                       
                titulo += " con el botón izquierdo del ratón";
            }
            JOptionPane.showMessageDialog(null, titulo);
        } // end method mouseClicked

        // handle event when mouse pressed
        public void mousePressed(MouseEvent event) {
            label.setText(String.format("Presionó en: [%d, %d]",
                    event.getX(), event.getY()));
        } // end method mousePressed

        // handle event when mouse released after dragging
        public void mouseReleased(MouseEvent event) {
            label.setText(String.format("Soltó en: [%d, %d]",
                    event.getX(), event.getY()));
        } // end method mouseReleased

        // handle event when mouse enters area
        public void mouseEntered(MouseEvent event) {
            label.setText(String.format("El Mouse entró en: [%d, %d]",
                    event.getX(), event.getY()));
            panel.setBackground(Color.RED);
        } // end method mouseEntered

        // handle event when mouse exits area
        public void mouseExited(MouseEvent event) {
            label.setText("Mouse fuera del JPanel");
            panel.setBackground(Color.BLUE);
        } // end method mouseExited

        // MouseMotionListener event handlers
        // handle event when user drags mouse with button pressed
        public void mouseDragged(MouseEvent event) {
            label.setText(String.format("Arrastro en: [%d, %d]",
                    event.getX(), event.getY()));
        } // end method mouseDragged

        // handle event when user moves mouse
        public void mouseMoved(MouseEvent event) {
            label.setText(String.format("Movio en: [%d, %d]",
                    event.getX(), event.getY()));
        } // end method mouseMoved
    } // end inner class MouseHandler
   
   
   
   
   
   
   
}

  
   