/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;



import javax.swing.JApplet;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
public class Principal extends JApplet implements KeyListener{

    public static void main(String[] args) {
        JTextArea cuadroTexto;
 JScrollPane scroll;
 
 public void init(){
  cuadroTexto=new JTextArea();
  scroll=new JScrollPane(cuadroTexto);
  cuadroTexto.setEditable(false);
  cuadroTexto.addKeyListener(this);
  
  add(scroll);
  
 }

 public void keyPressed(KeyEvent e) {
  cuadroTexto.append(e.getKeyText(e.getKeyCode())+"\n");
 }
 public void keyReleased(KeyEvent arg0) {
 }

 public void keyTyped(KeyEvent arg0) {
 }
    }
    
}
