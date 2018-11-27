
public class Tiempo5 {

  
    public static void main(String[] args) {
        float fah = 86;
        System.out.println(fah + "grados fahrenheit son.....");
        //para convertir grados fahrenheit a celcius
        //empesamos por restar 32
        
        fah = fah - 32;
        //dividimos el resultado por 9
        fah = fah / 9;
        //multiplicamos el resultado por 5
        fah = fah * 5;
        
       System.out.println(fah + "grados celcius/n");
       float cel = 32;
       System.out.println(cel + "grados celcius son ....");
         // para covertir de far a cel 
       // empesamos por restar 9 
       cel = cel - 9;
        //dividimos el resultado por 5
        cel = cel / 5;
        //añadimos 32 al resiltado
        cel= cel * 32;
        System.out.println(cel + "grados fahrenheit");
       
    }
    
}
