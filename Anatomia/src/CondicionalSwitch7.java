//condicional de seleccion 
public class CondicionalSwitch7 {

  
    public static void main(String[] args) {
        
        char grupo ='B';
        switch(grupo){
            // condicional switch
            
            case 'A':
                System.out.println("tienes una A. gran trabajo");
                break;// esto le dice al programa que salga o que deje de ejecutar 
            case 'B':
                System.out.println("tienes una B. buen trabajo ");
                break;
            case 'C':
                System.out.println("tienes una C. hay que trabajar mas ");
                break;
            default:// si no se cumplen las condiciones anteriores 
                System.out.println("tienes una D. nesesutas un gran  cambio ");
                
        }
    }
    
}
