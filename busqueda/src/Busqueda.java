import java.util.Random;
import java.util.Scanner;
 
/**
 *
 * @author Rafa
 */
public class Busqueda{
    private int[] datos;
    private static Random generador = new Random();
   
    public Busqueda(int tamano){
        datos = new int[tamano];
       
        for(int i=0; i<tamano; i++){
            datos[i] = 1+generador.nextInt(90); //guarda valores aleatorios al arreglo
        }
    }
   
    //realiza busqueda lineal de los datos
    public int busquedaLineal(int valorBusqueda){
        for(int indice = 0; indice<datos.length; indice++){
            if(datos[indice] == valorBusqueda){
                return indice;
            }  
        }
        return 0; //No se encontro coincidencia
    }
   
    //Metodo para imprimir los valores del arreglo
    public String toString(){
        StringBuilder temporal = new StringBuilder();
        //itera a traves del arreglo
        for(int elemento : datos)
            temporal.append(elemento + " ");
       
        temporal.append("\n"); //Agrega una nueva linea
        return temporal.toString();
    }
   
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int enteroBusqueda; //valor de la busqueda
        int posicion; //posicion de la coincidencia
       
        Busqueda arregloBusqueda = new Busqueda(10);
        System.out.println(arregloBusqueda);
        System.out.print("Escriba un valor entero ");
        enteroBusqueda = entrada.nextInt(); //lee el primer entero del usuario
       
                          //Mientras no se presione el '0' se hara lo siguiente:
        while(enteroBusqueda != 0){
            posicion = arregloBusqueda.busquedaLineal(enteroBusqueda);
            //Reliza una busqueda lineal
            if(posicion == 0) //no se encontro coincidencias
                System.out.println("el entero " + enteroBusqueda + " no se encontro.\n");
            else //se encontro coincidencia
                System.out.println("El entero " + enteroBusqueda + " se encontro en la posicion " + posicion + ".\n");
           
            System.out.print("Escriba un valor entero");
            enteroBusqueda = entrada.nextInt();
           
        }
       
                                  //Mensaje a pantalla al finalizar el programa (al presionar 0)
        if(enteroBusqueda == 0 ){
            System.out.println("EL programa ha finalizado");
        }
    }
}