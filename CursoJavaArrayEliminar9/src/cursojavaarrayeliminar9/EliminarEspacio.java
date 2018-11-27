
package cursojavaarrayeliminar9;

/**
 *
 * @author SAAIBI
 */
public class EliminarEspacio {

    public static void main(String[] args) {
       String citaDirecta = "la educacion consite en enseñar a los hombre ";
       char [] convertir = citaDirecta.toCharArray();
       for (int dex = 0; dex < convertir.length; dex++){
           char current = convertir[dex];
           if (current != ' '){
               System.out.print(current);
           }
           else{
               System.out.print(" - ");
           }
       }
    }
    
}
