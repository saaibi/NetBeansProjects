
package cursojava.loops8;
import java.util.*;
import static java.lang.System.out;
/**
 *
 * @author SAAIBI
 */
public class CursoJavaLoops8 {

    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);
        int NumeroIntentos = 0;
        int NumeroAleatorio =  new Random().nextInt(20)+1;
        out.println("++++++++++++++++++++++++");
        out.println("+  Bienvenido al juego +");
        out.println("++++++++++++++++++++++++");
        out.println();
        out.println("Escriba el numero de 1 al 20:");
        int NumeroEscritos = miScanner.nextInt();
        NumeroIntentos++;
        while (NumeroIntentos != NumeroAleatorio){// flujo de looops while 
            out.println();
            out.println("Intentalo de nuevo .....");
            out.println("Escriba el numero de 1 al 20:");
            out.println("Ya escribiste el numero " + NumeroEscritos);
            NumeroEscritos = miScanner.nextInt();
            NumeroIntentos++;
        }
        out.print("hola has ganado despues de ");
        out.println(NumeroIntentos + " intentos "); 
    }
    
}
