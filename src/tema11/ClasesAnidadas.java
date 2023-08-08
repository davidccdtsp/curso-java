package tema09;

import tema09.ClaseExterna.ClaseAnidadaEstatica;

public class ClasesAnidadas {

  public static void ejemplo01() {

    // Instanciacion de clase interna
    ClaseExterna claseExterna = new ClaseExterna();
    ClaseExterna.ClaseInterna claseInterna = claseExterna.new ClaseInterna();
    // Instaciacion de clase estatica
    ClaseAnidadaEstatica internaEstatica = new ClaseAnidadaEstatica();

    System.out.println();
    System.out.println("Clase interna");
    claseInterna.accesoMiembros();

    System.out.println("Clase estatica interna");
    internaEstatica.accesoMiembros(claseExterna);

  }

  public static void ejemplo02() {

    // Ejemplo clase local
    ClaseExterna claseExterna = new ClaseExterna();
    claseExterna.foo(12);

    ClaseExterna.staticFoo(27);

  }

  public static void ejemplo03() {
    // Ejemplo shadowing
    // Instanciacion de clase interna
    ClaseExterna claseExterna = new ClaseExterna();
    ClaseExterna.ClaseInterna claseInterna = claseExterna.new ClaseInterna();

    System.out.println();
    System.out.println("Clase Externa -> int numero = " + claseExterna.numero);
    System.out.println("Clase Interna -> int numero = " + claseInterna.numero);
    claseInterna.sumaNumero(10);

    claseExterna.numero = 85;

    System.out.println("Asignacion de nuevo valor claseExterna.numero = 85");
    System.out.println("Clase Externa -> int numero = " + claseExterna.numero);
    System.out.println("Clase Interna -> int numero = " + claseInterna.numero);

  }

  public static void ejemplo04() {
    // Ejemplo clase anonima

    // Interfaz
    interface Elemento {
      public int getNumeroAtomico();

      public String getNombre();
    }

    // // Clase anonima
    Elemento oro = new Elemento() {

      public static int cosa = 22;

      static {
        System.out.println("Esto es un Inicializador estatico dentro de una clase anonima");
        cosa = 23;
      }

      public int getNumeroAtomico() {
        return 79;
      };

      public String getNombre() {
        return "Au";
      };
    };

    Elemento plata = new Elemento() {
      public int getNumeroAtomico() {
        return 47;
      };

      public String getNombre() {
        return "Ar";
      };
    };

    System.out.println();
    System.out.println("Probando clases anonimas");
    System.out.println("Oro es una clase anonima con nombre: " + oro.getNombre() + " y Num atomico:"
        + oro.getNumeroAtomico());

  }

  public static void ejemplo05() {

    // Expresiones lambda

    // Interfaz
    interface Cosa {
      void foo();
    }

    Cosa lambda0 = () -> {
    };
    Cosa lambda1 = () -> {
      System.out.println("Cosa 1");
    };
    Cosa lambda2 = () -> {
      System.out.println("Cosa 2");
    };

    System.out.println();
    System.out.println("Probando expresiones lambda");
    lambda0.foo();
    lambda1.foo();

    interface Uno {
      abstract int foo(int num, int exp);     // Metodo abstracto
    }

    Uno lambda = (int valor, int exp) -> { 
      int resultado = valor;
      for(int i=1; i<exp; i++)
        resultado = resultado * valor;
      return resultado;
    };

    System.out.println(lambda.foo(2, 3));

    interface Dos {
      void foo1();
      abstract void foo2();
    }

    // Dos cosa = () -> {};   // Error


      // int contador = 0;

      // Uno lambda3 = (int num, int exp) -> {
      //   contador++;
      //   return (int)Math.pow(exp, numero);
      // };
    
  }



}
