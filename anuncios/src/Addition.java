import javax.swing.*;
public class Addition 
{

    
    public static void main(String[] args)
    {
      JFrame frame = new JFrame();
      JButton buton = new JButton("click me");
      
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.getContentPane().add(buton);
      frame.setSize(300, 300);
      frame.setVisible(true);
    }
    
}
    
    

