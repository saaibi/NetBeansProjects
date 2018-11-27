
package anidarloops8;

/**
 *
 * @author SAAIBI
 */
public class AnidarLoops {

    public static void main(String[] args) {
      int points = 0;
      int target = 100;
      while (target <= 100){
          for (int i =0; i < target; i++){
              if (points > 50 ){
                  System.out.println("saliendo del loop for ");
                  break;}
              points = points+1;
              
          }
      }
    }
    
}
