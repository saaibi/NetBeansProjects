import java.util.Scanner;
public class Principal
{
    public static void main(String [] args)
    {
	Scanner entrada = new Scanner (System.in);
        int N;
        int numero;
        System.out.println ("Inserta el numero incognito");
        N = entrada.nextInt();
        System.out.println ("Ingresa el numero para adivinar el numero incognito");
        numero = entrada.nextInt ();
        
        while (numero != N)
        {
            if (numero > N)
                System.out.println ("Ingresa un numero menor");
            else 
                System.out.println ("Ingresa un numero mayor");
            System.out.println ("Ingresa el numero para adivinar el numero incognito");
            numero = entrada.nextInt ();
        }
        System.out.println ("Acertaste al numero incognito");
    }
}

