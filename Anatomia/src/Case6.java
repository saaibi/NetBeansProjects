
public class Case6 {

   
    public static void main(String[] args) {
        String nombre = " Pedro Gonzalez";
        String minuscula = nombre.toLowerCase();//metodo para cambiar los caracteres en minuscula
        String mayusculas = nombre.toUpperCase();//metodo para cambiar los caracteres en mayuscula
        System.out.println(minuscula);//imprecion de minusculas 
        System.out.println(mayusculas);//imprecion de mayusculas
        System.out.println(" ");
        
        
        //para busscar trozos de texto dentro de un String
        //indexOf
        String texto = "hola como estas mi nombre es saaibi yesid florez hernandez , mi novia se llama camila adrea chacon ";
        int buscar = texto.indexOf("como");//metodo para buscar el caracter 
        System.out.println(buscar);   //imprecion- si lo encuentra mostrara la ubicacion y si no mostrara un -1
                
        
    }
    
}
