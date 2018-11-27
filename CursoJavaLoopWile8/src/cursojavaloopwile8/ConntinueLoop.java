
package cursojavaloopwile8;

/**
 *
 * @author YESID
 */
public class ConntinueLoop {

    public static void main(String[] args) {
        int index = 0;
        while (index <= 1000){
            index = index + 5;
            if (index == 400|| index == 500)
                continue;
              System.out.println(" El index es " + index);
            
       }
    }
    
}
