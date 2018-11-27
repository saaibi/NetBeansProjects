
import zoologico.*;


public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Animal animales[]=new Animal[3];
        animales[0]=new Perro();
        animales[1]=new Gato();
        animales[2]=new Hipopotamo();       
    
        //Polimorfismo
        for (int i = 0; i < animales.length; i++) {
            Animal animal = animales[i];
            animal.comer();
            animal.dormir();     
            System.out.println("El animal esta en el zoologico:"+animal.getNombreZoologico());
        }
        
    }
    
}
