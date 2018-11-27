
package cursojavaruedaarray9;

/**
 *
 * @author SAAIBI
 */
public class Rueda {

    public static void main(String[] args) {
        String Frase[] ={
        "Sentir,",
        "sentir que tu mano es mi caricia,",    
        "sentir que tu sueño es mi deseo,",
        "sentir que tu mirada es mi descanso,",
        "sentir que tu nombre es mi canción,",
        "sentir que tu boca es mi refugio,",
        "sentir que tu alma es mi regalo.",
        "Sentir que existes...",
        "sentir que vivo para amarte.",
        };
        int contadorLetras [] = new int[26];
        for (int contador = 0; contador < Frase.length; contador++){
            String current = Frase[contador];
            char[] letras = current.toCharArray();
            for (int contador2 = 2; contador2 < letras.length; contador2++){
                char let = letras[contador2];
                if ((let >= 'a') & (let <= 'z')){
                    contadorLetras[let - 'a']++;   
                }
            }
        }
               for (char contador3 = 'a'; contador3 <= 'z';contador3++ ){
                   System.out.print(contador3 + " : "+ contadorLetras[contador3 - 'a']+ " ");
               }
            System.out.println();
        }
    }
    

