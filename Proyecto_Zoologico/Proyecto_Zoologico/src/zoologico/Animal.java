/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zoologico;

/**
 *
 * @author sala5
 */
public class Animal {
    private String nombreZoologico="Zoologico Santa FE";
    protected String cuidad="Medellín";

    //Encapsulamiento
    public String getNombreZoologico() {
        return nombreZoologico;
    }

    public void setNombreZoologico(String nombreZoologico) {
        this.nombreZoologico = nombreZoologico;
    }
    
    public Animal() {
    }
    
    public void dormir() {
        System.out.println("El animal está durmiendo ...zzzz");
    }    
    
    public void comer() {
        System.out.println("El animal está comiendo !");
    }
    
}
