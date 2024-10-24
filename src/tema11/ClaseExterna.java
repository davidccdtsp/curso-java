package tema11;

class ClaseExterna {

  String propExterna = "Propiedad externa";
  private String propPrivadaExterna = "Propiedad privada externa";
  static String staticPropExterna = "Propiedad estatica externa";

  public int numero = 200;
  final int VALOR_CONSTANTE = 24;

  // ...
  class ClaseInterna {
    // El parametro numero enmascara al parametro numero de ClaseExterna
    public int numero = 10;

    public static void foo() {
      System.out.println("Soy un metodo estatico de una clase interna");
    }


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

  // Metodo con clase local
  public void foo(int parametro) {

    final int finalVariable = 0;
    int variable = 0;

    class ClaseLocal { // Clase local

      String texto = null;

      ClaseLocal(String texto) {
        // variable = 12; // Error si se descomenta
        this.texto = texto + " " + variable + " " + finalVariable + " " + parametro + " "
            + propPrivadaExterna;
      }

      public String toString() {
        return "ClaseLocal.texto = " + texto;
      }
    }


    ClaseLocal claseLocal = new ClaseLocal("Hola");
    System.out.println(claseLocal);

  }

  public static void staticDos(){}

  // Metodo estatico con clase local
  public static void staticFoo(int parametro) {
    int variable = 0;
    // String cadena = propExterna; // Error de compilacion
    String otraCadena = staticPropExterna;

    class ClaseLocal { // Clase local
      String texto = null;

      ClaseLocal(String texto) {
        // variable = 12; // Error si se descomenta
        this.texto = texto + " " + variable + " " + parametro + " " + staticPropExterna;
      }

      public String toString() {
        return "ClaseLocal.texto = " + texto;
      }
    }

    ClaseLocal claseLocal = new ClaseLocal("Metodo estatico");
    System.out.println(claseLocal);

  }

  // Interfaz
  interface Elemento {
    public int getNumeroAtomico();

    public String getNombre();
  }

  public void usoClaseAnonima() {

    int variableLocal = 120;

    Elemento oro = new Elemento() {
      static {
        System.out.println("Inicializador estatico en clase anonima");
      }

      public static int CONSTANTE = 117;
      interface cosa {}

      private int cosa = 79;
      public int getNumeroAtomico() {
        return cosa;
        // return variableLocal;
        // return numero;
      };

      public String getNombre() {
        return "Au";
      };
    };

    System.out.println();
    System.out.println("Probando clases anonimas 2");
    System.out.println("Oro es una clase anonima con nombre: " + oro.getNombre() + " y Num atomico:"
        + oro.getNumeroAtomico());


  }
}
