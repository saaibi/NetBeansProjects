class RobotDante{
  String estatus;
  int velocidad;
  float temperatura;
  
  void  conprobarTemperatura(){
      if (temperatura > 660){
          estatus = "volviendo a casa ";
          velocidad = 5;
        }
    }
  void  mostrarAtributos(){
      System.out.println("Estatus: " + estatus);
      System.out.println("Velocidad: " + velocidad);
      System.out.println("temperatura: " + temperatura);
    }
}