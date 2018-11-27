import java.io.*;
import java.util.Scanner;
public class Principal
{
    public static void main(String[] args) 
    {
        Scanner x = new Scanner(System.in);
        int [] edad = new int [3];
        
        for (int i=0; i<3; i++){
            System.out.println(" Por favor Ingrese su edad");
            try {
                edad [i]= x.nextInt(); 
            }
             catch(Exception e)
         {
	     System.out.println("Error General  "+ e.toString());
         }
            
             catch (NumberFormatException nfe)
                 
         {
	     System.out.println("Error de formato  "+ nfe.toString());
         }
            
            finally {
                System.out.println("Esto siempre se muestra");
            }
        }
        
    }
    
}

   
   
  
       

