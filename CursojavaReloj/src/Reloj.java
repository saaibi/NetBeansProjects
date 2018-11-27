import java.util.*;
public class Reloj {

    public static void main(String[] args) {
        //obvtener fecha y hora actual 
       Calendar ahora = Calendar.getInstance();
       int hora = ahora.get(Calendar.HOUR);
       int minuto = ahora.get(Calendar.MINUTE);
       int mes = ahora.get(Calendar.MONTH)+ 1 ;
       int dia = ahora.get(Calendar.DAY_OF_MONTH);
       int  año = ahora.get(Calendar.YEAR);
       
         //mostrar saludo 
       if (hora < 12){
           System.out.println("buenos dias.\n");
        } else if (hora < 17 ){
            System.out.println("buenas tardes.\n");
        } else {
            System.out.println("buenas noches.\n");
        }
            
       //iniciar el mensaje horario mostrando las horas 
        System.out.print("son las ");
        System.out.print(" ");
        System.out.print((hora > 12)?(hora = 12):hora );//condicional tornario 
        System.out.print(" horas ");
        
        //mostrar los minutao 
        if (minuto != 0){
            System.out.print(minuto + " ");
            System.out.print((minuto != 1) ? " minutos  ": "minuto ");//condicional tornario 
        }
        //mostrar dia 
        System.out.println("del dia " + dia + " de ");
        
        //mostrar el nombre del mes 
        switch (mes){//condicional switch
            case 1:
                System.out.print("enero");
                break;
            case 2:
                System.out.print("febrero");
                break;
            case 3:
                System.out.print("marzo");
                break;
            case 4:
                System.out.print("abril");
                break;
            case 5:
                System.out.print("mayo");
                break;
            case 6:
                System.out.print("junio");
                break;
            case 7:
                System.out.print("julio");
                break;
            case 8:
                System.out.print("agosto");
                break;
            case 9:
                System.out.print("sptiembre");
                break;
            case 10:
                System.out.print("octubre");
                break;
            case 11:
                System.out.print("novienbre");
                break;
            default:
                System.out.print("Diciembre");
        
        }
        //mostrar el año 
        System.out.println(  "  de " + año + "." );
    
    }
    
}
