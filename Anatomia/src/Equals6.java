
public class Equals6 {

    
    public static void main(String[] args) {
        String respuesta = "amarillo";   //metodo equals
        String resultado = "verde";
        System.out.println("has respondido que el color es" + resultado + "?");
        System.out.println("Respuesta: " + respuesta.equals(resultado)); //compara entre respuesta y resultado
        int tam = respuesta.length(); //numero de caracteres de respuesta = amarillo
        System.out.println(tam);
    
    }
    
    
}
