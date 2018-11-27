
package ejemplotextareal;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TextAreal implements ActionListener{

    
    JTextArea text;
    public static void main(String[] args) {
       TextAreal gui = new TextAreal();
       gui.go();
       
   }
    
    
    public void go(){
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JButton button = new JButton("clik");
        button.addActionListener(this);
        text = new JTextArea(10,20);
        text.setLineWrap(true);
        
        JScrollPane scroller = new JScrollPane(text);
        scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        
        panel.add(scroller);
        
        frame.getContentPane().add(BorderLayout.CENTER, panel);
        frame.getContentPane().add(BorderLayout.SOUTH, button);
        
        frame.setSize(350, 300);
        frame.setVisible(true);        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
      text.append("hola mundo "+ "\n");
    }
    
}
