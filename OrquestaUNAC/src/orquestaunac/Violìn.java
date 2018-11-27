
package orquestaunac;


public class Violìn extends InstrumentoMusical implements Afinar {
    int NumCuer;
    String Largo;
    String Ancho;

    public Violìn(int NumCuer, String Largo, String Ancho) {
        this.NumCuer = NumCuer;
        this.Largo = Largo;
        this.Ancho = Ancho;
    }
    
      
    

    @Override
    public void tensarCuerdas() {
       System.out.print("Tensando cuerdas:");
    }

    @Override
    public void aflojarCuerdas() {
        System.out.print("Aflojando cuerdas:");
    }

    @Override
    public void cambiarCuerdas() {
        System.out.println("Cambiando cuerdas");
    }
    
}
