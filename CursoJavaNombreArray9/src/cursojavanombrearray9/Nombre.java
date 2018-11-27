
package cursojavanombrearray9;
import java.util.*;

/**
 *
 * @author SAAIBI
 */
public class Nombre {


    public static void main(String[] args) {
        String nombres [] ={"saaibi","camila","yesid","andrea","jose","antonio","alicia","jakeline","adriana","dumas"};
        System.out.println("El orden original!");
        for(int i = 0; i < nombres.length; i++ ){
            System.out.print(i + " : " + nombres[i] + " " );         
        }
        Arrays.sort(nombres);
        System.out.println("\nEl nuevo de orden: ");
        for (int i = 0; i < nombres.length; i++){
            System.out.print(i + " : " + nombres[i] + " ");    
        }
       System.out.println();
    }
    
}
