class AplicacionRobot{
    
    public static void main(String[] arguments) {
      RobotDante dante = new RobotDante();
      dante.estatus = "explorando";
      dante.velocidad = 2;
      dante.temperatura = 510;   
      dante.mostrarAtributos();
      System.out.println("");
      System.out.println("Aumentar la velocidad a 3. ");
      dante.velocidad = 3;
      dante.mostrarAtributos();
      System.out.println("");
      System.out.println("Cambiar temperatura a 670. ");
      dante.temperatura = 670;
      dante.mostrarAtributos();
      System.out.println("");
      System.out.println("Comprobando la temperatura. ");
      dante.conprobarTemperatura();
      dante.mostrarAtributos();
   }  
}