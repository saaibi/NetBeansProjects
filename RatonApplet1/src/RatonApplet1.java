package raton1;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class RatonApplet1 extends Applet implements MouseListener {
    private final int radio = 8;
  public void init() {
    setBackground(Color.white);
    addMouseListener(this);
  }
  public void mousePressed(MouseEvent ev) {
    Graphics g = getGraphics();
    g.setColor(Color.red);
    g.fillOval(ev.getX()-radio, ev.getY()-radio, 2*radio, 2*radio);
    g.dispose();
  }
  public void mouseExited(MouseEvent event) {}
  public void mouseReleased(MouseEvent event) {}
  public void mouseClicked(MouseEvent event) {}
  public void mouseEntered(MouseEvent event) {}
}
