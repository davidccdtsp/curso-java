package tema09;

public class SuperClase {

  public int atr1 = 1;  // Acceso en todas las subclases
  protected int atr2;   // Acceso en todas las subclases
  int atr3;             // Acceso en subclases en mismo pqquete
  private int atr4;     // Sin acceso en subclases

  int metodo1() {        // Acceso en subclases en mismo pqquete
    return 14;
  }

  void foo() {
    System.out.println("SuperClase hereda de Object");
    System.out.println("int atr1 = "+atr1);
  }

  final void metodo2() {
    // Codigo aqui
  }

  static String metodoEstatico(){
    return "Metodo estatico en SuperClase";
  }


}
