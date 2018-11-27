
package orquestaunac;

public class Guitarra extends InstrumentoMusical implements Afinar{
     int NumCuer;
     int NumTras;

    public Guitarra(int NumCuer, int NumTras) {
        this.NumCuer = NumCuer;
        this.NumTras = NumTras;
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
