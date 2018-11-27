
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class EscuchadorInterno extends JFrame{
JButton boton1;
JButton boton2;

    public EscuchadorInterno() {
        super("Ejemplo Escuchador Interno");

        ImageIcon imagen1=new ImageIcon(getClass().getResource("imagen1.jpg"));
        ImageIcon imagen2=new ImageIcon(getClass().getResource("imagen2.jpg"));

        boton1=new JButton("Boton 1",imagen1);

        boton1.setRolloverIcon(imagen2);
        
        boton2=new JButton("Boton 2");

        EscuchadorBotones escuchador=new EscuchadorBotones();
        boton1.addActionListener(escuchador);
        boton2.addActionListener(escuchador);
        setLayout(new FlowLayout());
        add(boton1);
        add(boton2);

    }

    /*Clase interna que sera el escuchador (Listener)*/
    public class EscuchadorBotones implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null, "El evento fue en:"+e.getActionCommand());
        }

    }



}
