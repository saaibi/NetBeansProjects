
package evento1;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static javafx.scene.paint.Color.color;
import javax.swing.*;


public class Evento1 extends JPanel implements ActionListener
      
{
    private JButton redButton;
     private JButton greenButton;
      private JButton blueButton;
      {
          redButton = new JButton("rojo");
          greenButton = new JButton("verde");
          blueButton = new JButton("azul");
          
          this.add(redButton);
          this.add(greenButton);
          this.add(blueButton);
          
          redButton.addActionListener(this);
          greenButton.addActionListener( this);
          blueButton.addActionListener( this);
          }
      public void actionPerformed (ActionEvent event)
      {
        Object source = event.getSource();
        Color color = getBackground();
        
        if (source == redButton)
          color = Color.RED;
        else if (source == greenButton)
             color = Color.GREEN;
        else if (source == blueButton)
             color = Color.BLUE;
        
          setBackground(color);
          repaint();
          
      }
      
    
    
}
