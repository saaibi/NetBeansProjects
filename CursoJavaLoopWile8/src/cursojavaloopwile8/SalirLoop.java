
package cursojavaloopwile8;

/**
 *
 * @author YESID
 */
public class SalirLoop {

    public static void main(String[] args) {
        int index = 0;
        while (index <= 1000){
            index = index + 5;
            System.out.println(index);
            if (index == 400){
                 System.out.print("index = 400. saliendo......");
                 break;
            }
        }
    }
    
}
