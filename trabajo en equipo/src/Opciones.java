
    
    
    import java.util.Scanner;

public class Opciones {
    public void leermatriz (){
        
        String[][] Matriz1 = new String[100][5];
        
        
        Scanner captura = new Scanner(System.in);
        System.out.println("Cuantas personas se almacenaran en la matriz?");
        int n = captura.nextInt();
        
        
        
            for (int j = 0; j < n ; j++) {
                
                Scanner capturaNom = new Scanner(System.in);
                System.out.println("Por favor, Ingrese el Nombre : ");
                Matriz1[j][0] = capturaNom.nextLine();
                
                Scanner capturaApe = new Scanner (System.in);
                System.out.println("Por favor, Ingrese el Apellido : ");
                Matriz1 [j][1] = capturaApe.nextLine();
                
                Scanner capturaEst = new Scanner (System.in);
                System.out.println("Por favor, Ingrese el Estrato");
                Matriz1 [j][2] = capturaEst.nextLine();
                
                Scanner capturaBar = new Scanner (System.in);
                System.out.println("Por favor, Ingrese el Barrio");
                Matriz1 [j][3] = capturaBar.nextLine();
                
                Scanner capturaCiu = new Scanner (System.in);
                System.out.println("Por favor, Ingrese la Ciudad");
                Matriz1 [j][4] = capturaCiu.nextLine();
                
                
            }
            
            // Busqueda
            
            Scanner CiudadBus = new Scanner(System.in);
            System.out.println("Digite la ciudad a Buscar");
            String BusCiudad = CiudadBus.nextLine();
            
            
            if (BusCiudad.equals(Matriz1[n][4])){
            
                
            }
    
                
                
            
            
        
        

