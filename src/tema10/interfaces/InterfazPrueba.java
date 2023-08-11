package tema10.interfaces;

public interface InterfazPrueba {

  // Método default
  default int foo(){
    return 22;
  }



  static void metodoEstatico(){
    System.out.println("Metodo estatico");
  };
  
}
