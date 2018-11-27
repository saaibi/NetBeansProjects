/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zoologico;

/**
 *
 * @author sala5
 */
//Herencia
public class Perro extends Animal{
    
    @Override
    public void comer(){
    System.out.println("El Perro está comiendo !");
    }    

    public Perro() {
        super();
        System.out.println("Ciudad del zoologico donde esta el perro:"+cuidad);
    }   
    
}
