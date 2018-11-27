import javax.swing.JFrame;


class MyFrame extends JFrame // esta es una ventana 
{ 
    private Object contenedorPrincipal;

MyFrame () 
        
{ 
super("Titulo de MyFrame"); // el titulo de la ventana 
contenedorPrincipal = this.getContentPane (); // el panel por defecto 
contenedorPrincipal.setLayout (new GridLayout (2, 2)); // le damos forma de matrix de 2x2 
// Agregamos 4 etiquetas al panel 
contenedorPrincipal.add (new JLabel ("Izquierda Arriba")); 
contenedorPrincipal.add (new JLabel ("Derecha Arriba")); 
contenedorPrincipal.add (new JLabel ("Izquierda Abajo")); 
contenedorPrincipal.add (new JLabel ("Derecha Abajo")); 
this.setVisible (true); // mostramos la ventana 
this.pack(); // la ajustamos 
this.setDefaultCloseOperation (this.EXIT_ON_CLOSE); // le decimos que se cierre cuando se pulse la X 
} 

public static void main (String []a) 
{ 
new MyFrame(); 
} 
}