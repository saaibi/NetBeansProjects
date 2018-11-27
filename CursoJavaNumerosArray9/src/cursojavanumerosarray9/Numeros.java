
package cursojavanumerosarray9;
import java.util.*;
/**
 *
 * @author SAAIBI
 */
public class Numeros {

    public static void main(String[] args) {
        int nombres [] ={2,4,7,8,9,3,12,18,10,20,12,17,12,10,40};
        System.out.println("El orden original!");
        for(int i = 0; i < nombres.length; i++ ){
            System.out.print(i + " : " + nombres[i] + " - " );         
        }
        Arrays.sort(nombres);
        System.out.println("\nEl nuevo de orden: ");
        for (int i = 0; i < nombres.length; i++){
            System.out.print(i + " : " + nombres[i] + " - ");    
        }
       System.out.println();
    }
    
}
