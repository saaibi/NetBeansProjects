
package orquestaunac;


public class Piano extends InstrumentoMusical implements Acondicionamiento{
    
    String Marca;

    public Piano(String Marca) {
        this.Marca = Marca;
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
