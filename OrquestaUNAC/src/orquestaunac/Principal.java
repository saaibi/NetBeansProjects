
package orquestaunac;

public class Principal {
    
    
    public static void main(String[] args) {
        
        OrquestaUNAC orquesta = new OrquestaUNAC();
        InstrumentoMusical instrumento = new InstrumentoMusical();
        
        orquesta.afinar();
        
        orquesta.ensayar();
        System.out.println("Comienza el concierto");
        orquesta.HimnoDeAlegria();
        orquesta.SoyColombiano();
        orquesta.CuatroEstaciones();
        orquesta.LaGotaFria();
        
        
        
        
        
        
        
        
    }
}
