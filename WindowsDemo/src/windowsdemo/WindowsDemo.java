package programa;
 
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
 
class WindowDemo extends JFrame {
 
    public WindowDemo() {
        super("Ventana personalizada");
 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        Image icon = new ImageIcon(getClass().getResource("/programa/imagenes/love.png")).getImage();
        setIconImage(icon);
 
        setSize(350, 350);
        setLocationRelativeTo(null);
        setVisible(true);
    }
 
    public static void main(String[] args) {
        WindowDemo windowDemo = new WindowDemo();
    }
}