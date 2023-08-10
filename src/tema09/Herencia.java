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

  public static void ejemplo07() {
    // Metodos de la clase Objects

    // toString()
    Vehiculo unVehiculo = new Vehiculo(20, 1200);
    System.out.println();
    System.out.println("Creando objeto de la clase Vehiculo:");
    System.out.println(unVehiculo);

    // equals()
    Vehiculo otroVehiculo = new Vehiculo(20, 1300);
    Vehiculo vehiculoIgual = new Vehiculo(20, 1200);

    System.out.println();
    System.out.println("Creando dos vehiculos:");
    System.out.println(otroVehiculo);
    System.out.println(vehiculoIgual);

    System.out.println();
    System.out.println("Comparando vehiculos");
    if (unVehiculo.equals(vehiculoIgual)) {
      System.out.println(unVehiculo);
      System.out.println("Es IGUAL al");
      System.out.println(vehiculoIgual);
    } else {
      System.out.println(unVehiculo);
      System.out.println("NO Es IGUAL al");
      System.out.println(vehiculoIgual);
    }

    System.out.println();
    System.out.println("Comparando vehiculos");
    if (unVehiculo.equals(otroVehiculo)) {
      System.out.println(unVehiculo);
      System.out.println("Es IGUAL al");
      System.out.println(otroVehiculo);
    } else {
      System.out.println(unVehiculo);
      System.out.println("NO Es IGUAL al");
      System.out.println(otroVehiculo);
    }

    // hashCode()
    boolean resultado = (unVehiculo.hashCode() == vehiculoIgual.hashCode());

    System.out.println();
    System.out.println(resultado);

    resultado = (unVehiculo.hashCode() == otroVehiculo.hashCode());

    System.out.println(resultado);


    // getClass()

    String cadena = "Pelicano";
    Number numero = 23;
    SubClase subclase = new SubClase();

    Class claseCadena = cadena.getClass();
    Class claseNumero = numero.getClass();
    Class claseSub = subclase.getClass();

    System.out.println();
    System.out.println(claseCadena);
    System.out.println(claseNumero);
    System.out.println(claseSub);
    System.out.println(claseSub.getSimpleName());
    System.out.println(claseSub.getSuperclass());

    // clone()

    Persona hija = new Persona("Ada Lovelace");
    Persona padre = new Persona("Lord Byron", hija);

    Persona clonPadre = padre.clone();

    System.out.println();
    System.out.println(padre + " " + padre.hashCode());
    System.out.println(clonPadre + " " + clonPadre.hashCode());

    clonPadre.setNombre("George Gordon Byron");
    hija = clonPadre.getHijo();
    hija.setNombre("Augusta Adad King");
    System.out.println(padre);
    System.out.println(clonPadre);



    // finalize()
    // padre.finalize();
    Persona persona = new Persona("Lord Byron");
    persona = null;
    System.gc(); // Llama al recolector de basura

    try {
      Thread.sleep(5000); // Espera 5 segundos
    } catch (InterruptedException e) {
      e.printStackTrace();
    }


  }

  public static void ejemplo08() {

    NuevaClase objeto = new NuevaClase();

    System.out.println();
    System.out.println("Creando objeto de la case NuevaClase que hereda de ClaseAbstracta");
    objeto.foo();
  }

}
