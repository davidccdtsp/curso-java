package tema09;

public class Herencia {

  public static void ejemplo01() {

  }

  public static void ejemplo02() {

    Vehiculo vehiculo1 = new Vehiculo(0, 1000);
    Avion vehiculo2 = new Avion(700, 20000, 42600);
    Vehiculo vehiculo3 = new Avion(500, 15000, 42600);

    // Herencia.foo(vehiculo1); //Error de compilacion
    // Herencia.foo((Avion)vehiculo1); //Error en tiempo de ejecucion
    Herencia.foo(vehiculo2); // OK
    Herencia.foo((Avion) vehiculo3); // OK
  }

  public static void foo(Avion avion) {
    System.out.println("Es un avion volando a " + avion.velocidad + "km/h y a una altura de "
        + avion.getAltura() + " pies");
  }

  public static void ejemplo03() {
    // Sobreescritura
    SuperClase superClase = new SuperClase();
    SubClase subClase = new SubClase();
    SuperClase subClaseB = subClase;

    System.out.println();
    System.out.println("Creado objeto superClase de la clase SuperClase");
    System.out.println("Creado objeto subClase de la clase SubClase");
    System.out.println("Referencia subClaseB a subClase");
    System.out.println();

    System.out.println("Llamando a superClase.foo()");
    superClase.foo();
    System.out.println("Llamando a subClase.foo()");
    subClase.foo();
    System.out.println("Llamando a subClaseB.foo()");
    subClaseB.foo();

  }

  public static void ejemplo04() {
    SubClase subClase = new SubClase();
    SuperClase superClase = subClase; // Mismo objeto que subClase

    System.out.println();
    System.out.println("Creado objeto subClase de la clase SubClase");
    System.out
        .println("Creada nueva referencia a subClase en la variable superClase de tipo SuperClase");

    System.out.println("Llamando al metodo estatico desde subClase");
    subClase.metodoEstatico();
    System.out.println("Llamando al metodo estatico desde la referencia de tipo SuperClase");
    superClase.metodo1();
  }

  public static void ejemplo05() {
    // Polimorfismo
    Vehiculo vehiculo, coche, avion;

    vehiculo = new Vehiculo(0, 200);
    coche = new Coche(1600, 50, 5);
    avion = new Avion(1200, 2000, 20000);

    System.out.println();
    System.out.println("Creado objeto vehiculo de la clase Vehiculo");
    System.out.println("Creado objeto coche de la clase Coche");
    System.out.println("Creado objeto avion de la clase Avion");

    vehiculo.descripcion();
    coche.descripcion();
    avion.descripcion();

  }

  public static void ejemplo06() {
    // Ocultacion de atributos

    SuperClase superClase = new SuperClase();
    SubClase subClase = new SubClase();
    SuperClase referencia = subClase; // Referencia

    System.out.println();
    System.out.println("Creado objeto superClase de la clase SuperClase");
    System.out.println("Creado objeto subClase de la clase SubClase");
    System.out.println("Referencia referencia a subClase");
    System.out.println();

    superClase.foo();
    subClase.foo();
    referencia.foo();

    // Mostrando atributos ocultos

    System.out.println();
    subClase.mostarAtributoOculto();
  }

}
