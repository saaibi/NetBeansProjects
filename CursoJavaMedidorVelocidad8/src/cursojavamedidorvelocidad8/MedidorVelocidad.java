
package cursojavamedidorvelocidad8;
import java.util.*;
/**
 *
 * @author SAAIBI
 */
public class MedidorVelocidad {

    public static void main(String[] args) {
        Calendar start = Calendar.getInstance();
        int starMinute = start.get(Calendar.MINUTE);
        int starSecond = start.get(Calendar.SECOND);
        start.roll(Calendar.MINUTE, true);
        int nextMinute = start.get(Calendar.MINUTE);
        int nextSecond = start.get(Calendar.SECOND);
        int index = 0;
        while(true){
            double x = Math.sqrt(index);
            GregorianCalendar now = new GregorianCalendar();
            if (now.get(Calendar.MINUTE) >= nextMinute){
                if (now.get(Calendar.SECOND) >= nextSecond){
                    break;
                    
                }
                
            }
            index++;
        }
        System.out.println(index + " loop in  one minute. " );
    }
    
}
