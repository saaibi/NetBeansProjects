
package nombrarloops8;

/**
 *
 * @author SAAIBI
 */
public class NombrarLoops {

    public static void main(String[] args) {
       int points = 0;
      int target = 100;
      targetLoop:
      while (target <= 100){
          for (int i =0; i < target; i++){
              if (points > 50 ){
                   System.out.println("poist =  "+points);
                  System.out.println("saliendo del loop for ");
                  break targetLoop;}
              points = points+1;
          }
      }
    }
    
}
