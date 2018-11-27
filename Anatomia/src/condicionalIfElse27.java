import java.util.Scanner;
public class condicionalIfElse27 {

   
    public static void main(String[] args) {
        
        Scanner in= new Scanner(System.in);
        
        
        int puntuacion;
        System.out.println("cual es tu ountuacion");
        puntuacion = in.nextInt(); 
        
        if ((puntuacion < 3) &&(puntuacion >=1)  ){
            System.out.println("has desaprobado el examen: "  + puntuacion);
           }
        else if ((puntuacion  >=3)&&(puntuacion <=5)  ){
            System.out.println("has aprobado el examen: " + puntuacion);
        }
        else if ((puntuacion >  5) ||(puntuacion  < 1) ){
            System.out.println("el valor ingresado no es valido");     
                    }
            
            
        }       
        
    }
    

