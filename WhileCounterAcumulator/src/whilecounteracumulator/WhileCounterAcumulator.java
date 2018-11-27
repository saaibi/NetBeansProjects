

package whilecounteracumulator;
import javax.swing.JOptionPane;
public class WhileCounterAcumulator {

    
    public static void main(String[] args) {
        int counter = 0;
		int accumulator = 0;
		while (counter < 5) {
			counter = counter + 1;
			accumulator = accumulator + Integer.parseInt(JOptionPane
				.showInputDialog("Ingresar el " + counter + "º número"));
		}
		JOptionPane.showMessageDialog(null, "La suma de los 5 números es " + accumulator);
	
    }
    
}
