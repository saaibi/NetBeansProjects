import java.util.Scanner;
public class CondicionalIfElse7 {

   
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int puntuacion;
        System.out.println("Cual es tu puntuacion");
        puntuacion = in.nextInt();
        char grupo = 'C';
        if (puntuacion >=5){
            System.out.println("has aprobado ");
            System.out.println("tu nota final es "+ puntuacion);
            grupo = 'A';
         }
        else {
             System.out.println("no has aprobado ");
            System.out.println("tu nota final es "+ puntuacion);
            grupo = 'B';
            
        }
            
            
          System.out.println("formas parte del grupo: " + grupo);
        
    }
    
  
}