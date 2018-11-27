/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author usuario
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Televisor tv=new Televisor("42", "full HD", "Negro", "Sony", 890000);
        tv.prender();
        tv.verCanalCaracol();
        tv.apagar();
        
        
        
    }
    
}
