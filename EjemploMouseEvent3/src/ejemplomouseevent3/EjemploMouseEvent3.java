package ejemplomouseevent3;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;

public class EjemploMouseEvent3 extends JApplet {

    JTextArea area;

    public void init() {
        JPanel panelPrincipal = (JPanel) this.getContentPane();
        panelPrincipal.setLayout(new BoxLayout(panelPrincipal, BoxLayout.Y_AXIS));
        JLabel etiqueta = new JLabel("Java Zone");
        area = new JTextArea();
        MouseListener ml = new MouseListener() {
            @Override
            public void mouseReleased(MouseEvent arg0) {
                area.append("Solto la etiqueta\n");
            }

            @Override
            public void mousePressed(MouseEvent arg0) {
                area.append("Pulso la etiqueta\n");
            }

            @Override
            public void mouseExited(MouseEvent arg0) {
                area.append("Salio de la etiqueta\n");
            }

            @Override
            public void mouseEntered(MouseEvent arg0) {
                area.append("Entro a la etiqueta\n");
            }

            @Override
            public void mouseClicked(MouseEvent arg0) {
                area.append("Dio Clic a la etiqueta\n");
            }
        };
        etiqueta.addMouseListener(ml);
        panelPrincipal.add(etiqueta);
        panelPrincipal.add(area);
    }

}
