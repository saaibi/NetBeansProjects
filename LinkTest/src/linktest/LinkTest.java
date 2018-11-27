/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linktest;
import javax.swing.*;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

 public class LinkTest extends JFrame {

 public LinkTest() {
 JPanel p = new JPanel();

 JLabel link = new JLabel("Click here");
 link.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
 link.addMouseListener(new MouseAdapter() {
   public void mouseClicked(MouseEvent e) {
      if (e.getClickCount() > 0) {
          if (Desktop.isDesktopSupported()) {
                Desktop desktop = Desktop.getDesktop();
                try {
                    URI uri = new URI("http://www.google.com");
                    desktop.browse(uri);
                } catch (IOException ex) {
                    ex.printStackTrace();
                } catch (URISyntaxException ex) {
                    ex.printStackTrace();
                }
        }
      }
   }
});
p.add(link);
getContentPane().add(p);
 }

 public static void main(String[] args) {
  LinkTest linkTest = new LinkTest();
  linkTest.setSize(640,100);
  linkTest.show();
 }
}