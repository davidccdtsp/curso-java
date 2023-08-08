package tema11;

class ClaseExterna {

  String propExterna = "Porpiedad externa";
  private String propPrivadaExterna = "Propiedad privada externa";
  static String staticPropExterna = "Propiedad estatica externa";

  public int numero = 200;
  final int VALOR_CONSTANTE = 24;

  // ...
  class ClaseInterna {

    // El parametro numero enmascara al parametro numero de ClaseExterna
    public int numero = 10;

    void accesoMiembros() {
      System.out.println(propExterna);
      System.out.println(propPrivadaExterna);
      System.out.println(staticPropExterna);

    }

    void sumaNumero(int numero) {
      this.numero += numero;
      System.out.println("Metodo sumaNumero() de la clase Interna");
      System.out.println(numero + " + " + (this.numero - numero) + " = " + numero);
    }


    // ClaseAnidadaEstatica internaEstatica = new ClaseAnidadaEstatica();
  }

  static class ClaseAnidadaEstatica {

    void accesoMiembros(ClaseExterna claseExterna) {
      // System.out.println(propExterna); // Error de compilacion
      // System.out.println(propPrivadaExterna); // Error de compilacion
      System.out.println(staticPropExterna); // Acceso a propiedad estatica
    }

  }

  // Metodo con clase anidada interna
  public void foo(int parametro) {

    final int finalVariable = 0;
    int variable = 0;
    
    class ClaseLocal { // Clase local
      String texto = null;

      ClaseLocal(String texto){
        // variabele = 12;         // Error si se descomenta
        this.texto = texto +" "+variable+" "+finalVariable+ " "+parametro;
      }

      public String toString() {
        return "ClaseLocal.texto = "+texto;
      }
    }


    ClaseLocal claseLocal = new ClaseLocal("Hola");
    System.out.println(claseLocal);

  }

  // Metodo estatico con clase anidada
  public static void staticFoo(int parametro) {
    int variable = 0;
    // String cadena = propExterna;  // Error de compilacion
    String otraCadena = staticPropExterna;

    class ClaseLocal { // Clase local
      String texto = null;

      ClaseLocal(String texto){
        // variabele = 12;         // Error si se descomenta
        this.texto = texto +" "+variable+" "+parametro;
      }

      public String toString() {
        return "ClaseLocal.texto = "+texto;
      }
    }

    ClaseLocal claseLocal = new ClaseLocal("Metodo estatico");
    System.out.println(claseLocal);

  }
}
