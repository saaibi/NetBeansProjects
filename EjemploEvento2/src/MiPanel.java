
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Guillermo
 */
public class MiPanel extends JPanel implements ActionListener{

    private JButton botonAzul;
    private JButton botonRojo;
    private JButton botonVerde;

    //constructor
    public MiPanel() {
        
        //instanciar los botones
        botonAzul=new JButton("Azul");
        botonRojo=new JButton("Rojo");
        botonVerde=new JButton("Verde");
        
        //Agregar los botones al panel
        this.add(botonAzul);
        this.add(botonRojo);
        this.add(botonVerde);
        
        //adicionamos los escuchadores a los botones
        //this por que esta clase es capaz de escuchador de eventos de boton 
        //por implementar la interfaz
        botonAzul.addActionListener(this);
        botonRojo.addActionListener(this);
        botonVerde.addActionListener(this);
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object origenEvento=e.getSource();
        Color colorFondo=getBackground();
        //revisar en cual boton ocurrio el evento
        if (origenEvento==botonAzul)
            colorFondo=Color.blue;
        else if (origenEvento==botonRojo)
            colorFondo=Color.red;
        else if (origenEvento==botonVerde)
            colorFondo=Color.green;
        
        //colocar el color de fondo al panel
        setBackground(colorFondo);
        //volver a pintar el panel
        repaint();
        
        
    }
    
}
