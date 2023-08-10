package tema09;

public class SubClase extends SuperClase {
  float atr1 = 22.12f;        // Oculta atributo en superclase

  // Sobreescritura de metodo
  void foo() {   
    // super.foo();  // Invoca el metodo en la superclase
    System.out.println("SubClase hereda de SuperClase");
    System.out.println("float atr1 = "+atr1);
  }

  void mostarAtributoOculto(){
    System.out.println("Atributo que oculta al atributo en la superclase");
    System.out.println("float atr1 = "+atr1);
    System.out.println("Atributo oculto");
    System.out.println("int atr1 = "+super.atr1);
  }

  static String metodoEstatico(){
    return "Metodo estatico en SubClase";
  }

  // void metodo2() {  // Error al tratar de sobreescribir un metodo final
  // }

}
