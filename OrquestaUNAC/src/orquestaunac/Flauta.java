
package orquestaunac;


public class Flauta extends InstrumentoMusical implements Acondicionamiento{
       String Material;
       int Agujeros ;

    public Flauta(String Material, int Agujeros)   {
        this.Material = Material;
        this.Agujeros = Agujeros;
    }
     
    
    
    @Override
    public void ajustarAcustica() {
          System.out.println("Ajustando acustica:");
    }

    @Override
    public void extenderOctavas() {
           System.out.println("Extendiendo octavas:");
    }

    @Override
    public void ajustarTonos() {
        System.out.println("Ajustando tonos ");
    }
    
    
}
