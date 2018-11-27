
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MiVentana implements ActionListener{
JButton miboton;

    public static void main(String[] args) {
        MiVentana principal=new MiVentana();
        principal.iniciar();

        /*La otra ventana*/
        EscuchadorInterno ventana2=new EscuchadorInterno();
        ventana2.setVisible(true);
        ventana2.setLocation(10, 10);
        ventana2.setSize(700, 500);
        ventana2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "dio Click en el Botón");
        miboton.setText("Dio Click");
    }

    private void iniciar() {
        JFrame ventana=new JFrame("Ejemplo Evento");
        miboton=new JButton("Dar click");
        miboton.addActionListener(this);
        ventana.add(miboton);
        ventana.setSize(200,200);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setDefaultLookAndFeelDecorated(true);
        ventana.setVisible(true);
        ventana.setLocation(250, 250);

    }

}
