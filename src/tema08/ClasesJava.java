package tema08;

import controlAcceso.AnotherSample;
import controlAcceso.Ejemplo;
import controlAcceso.EjemploPorDefecto;
import controlAcceso.EjemploPrivado;
import controlAcceso.Pruebas;
// import controlAcceso.Sample;

public class ClasesJava {
	
    enum Pais {
        USA, GBR, ESP, FRA, ITA, DEU
      };

  public static void ejemplo01() {

    Clase objeto = new Clase();

    objeto.valorPublico = 22;
    // objeto.valorPrivado = 10;
    objeto.imprimirValor();

    objeto.setValorPrivado(15);
    objeto.imprimirValor();

  }

  public static void ejemplo02() {

    Clase instanciaDeClase = new Clase();

    double resultado = instanciaDeClase.calcular(2.2d, 3.75d, 4.0011d);
    resultado = instanciaDeClase.calcular(1, 2);

    // Llamando al constructor de la clase
    Coche coche = new Coche(1600, 310, 1600);

    System.out.println(coche);
    coche.entrar(new Pasajero("A", 86), new Pasajero("B", 67), new Pasajero("C", 76));
    System.out.println("Entran pasajeros");
    System.out.println(coche);



  }

  public static void ejemplo03() {

    Clase instanciaDeClase = new Clase();

    // Uso de metodos que aceptan un numero variabe de argumentos
    instanciaDeClase.metodo(117, "Roca", "Caliza", "Granitica");
    instanciaDeClase.metodo(28, "Roca");

    System.out.println();

    // Paso por valor y referencia
    int masa = 100; // Tipo primitivo
    Planeta planeta = new Planeta("Mercurio"); // Objeto

    System.out.println("int masa = " + masa);
    System.out.println("Planeta planeta = " + planeta);

    instanciaDeClase.modificaParametros(masa, planeta);

    System.out.println("Valores tras invocacion del metodo");
    System.out.println("int masa = " + masa);
    System.out.println("String planeta = " + planeta);

    // Mostrando hashCodes
    Planeta nuevoPlaneta;
    nuevoPlaneta = new Planeta("Jupiter");
    Planeta otroPlaneta = nuevoPlaneta;
    System.out.println();
    System.out.println("Creado un objeto Planeta: " + nuevoPlaneta);
    System.out.println("Planeta nuevoPlaneta ->" + nuevoPlaneta.hashCode());
    System.out.println("Planeta otroPlaneta ->" + otroPlaneta.hashCode());

    otroPlaneta = new Planeta("Jupiter");

    System.out.println("Creado otro objeto Planeta: " + otroPlaneta);
    System.out.println("Planeta nuevoPlaneta ->" + nuevoPlaneta.hashCode());
    System.out.println("Planeta otroPlaneta ->" + otroPlaneta.hashCode());

    // Acceso a propiedades y metodos
    Planeta desconocido = new Planeta("A209874");
    int diametro = desconocido.diametro;

    System.out.println();
    System.out.println("Creando otro objeto Planeta: " + desconocido);
    System.out.println("Su diametro se inicializa a: " + diametro);

    desconocido.diametro = 12000;
    desconocido.setNombre("Coruscant");

    System.out.println("Cambiamos su diametro a: " + diametro);
    System.out.println("Cambiamos su nombre a: " + desconocido.getNombre());

    // Diametro vale 0, el planeta creado se pierde
    diametro = new Planeta("Tierra").diametro;


  }

  // Ejemplos control de acceso
  public static void ejemplo04() {

    // Acceso a clase publica con miembros publicos
    Ejemplo ejemplo = new Ejemplo();
    System.out.println(Ejemplo.title);
    System.out.println(ejemplo.year);
    ejemplo.printYear();

    // Acceso a clase publica con miembros con acceso por defecto
    EjemploPorDefecto porDefecto = new EjemploPorDefecto();
    // El siguiente codigo producira un error
    // System.out.println(EjemploPorDefecto.title);
    // System.out.println(porDefecto.year);
    // porDefecto.printYear();

    // Acceso a clase publica con miembros con acceso por defecto
    // desde el propio paquete
    Pruebas pruebas = new Pruebas();
    pruebas.porDefecto();

    // Protected desde el mismo paquete
    AnotherSample anotherSample = new AnotherSample();
    anotherSample.helper();

    // Protected desde fuera del paquete
    Child hijo = new Child();
    hijo.helper();

    // Acceso a miembros privados desde fuera de la clase
    // y desde otro paquete
    EjemploPrivado privado = new EjemploPrivado();

    // El siguiente codigo producira un error
    // System.out.println(EjemploPrivado.title);
    // System.out.println(privado.year);
    // privado.printYear();
  }

  // Ejemplos miembros de clase
  public static void ejemplo05() {

    System.out.println();
    System.out.println("La variable de clase Coche.fabricados = " + Coche.fabricados);
    // Modificando el valor sin instancias
    Coche.fabricados = 100;
    System.out.println("Modificamos su valor a 100");
    System.out.println("Coche.fabricados = " + Coche.fabricados);

    System.out.println();
    Coche coche1 = new Coche(1625, 411, 2693);
    System.out.println("Creamos una instancia de Coche");
    System.out.println("Coche.fabricados = " + Coche.fabricados);
    Coche coche2 = new Coche(1635, 421, 2729);
    System.out.println("Creamos otra instancia de Coche");
    System.out.println("Coche.fabricados = " + Coche.fabricados);
    System.out.println("Coche 1: " + coche1);
    System.out.println("Coche 2: " + coche2);

    System.out.println();
    // System.out.println("La variable de clase Bicicleta.fabricadas = " + Bicicleta.fabricados); //
    // Error
    System.out
        .println("La variable de clase Bicicleta.fabricadas = " + Bicicleta.unidadesFabricadas());

    System.out.println();
    Bicicleta bici1 = new Bicicleta("Transition Spire");
    System.out.println("Creamos una instancia de Bicicleta");
    System.out.println("Bicicleta.fabricadas = " + Bicicleta.unidadesFabricadas());
    Bicicleta bici2 = new Bicicleta("Santa Cruz Nomad");
    System.out.println("Creamos otra instancia de Bicicleta");
    System.out.println("Bicicleta.fabricadas = " + Bicicleta.unidadesFabricadas());
    System.out.println("Bicicleta 1: " + bici1);
    System.out.println("Bicicleta 2: " + bici2);


  }

  // Enums
  public static void ejemplo06() {

    System.out.println();
    System.out.println("Creando enumerado Paises");

    Pais pais = Pais.GBR;
    int codigoPais;

    switch (pais) {
      case USA: codigoPais = 840; break;
      case GBR: codigoPais = 626; break;
      case ESP: codigoPais = 724; break;
      case FRA: codigoPais = 250; break;
      case ITA: codigoPais = 380; break;
      case DEU: codigoPais = 276; break;
      default: codigoPais = 0; break;
    }

    System.out.println("El codigo de pais para "+pais+" es "+codigoPais+" "+pais);

  }

//  // Records
//  public static void ejemplo07() {
//
//    System.out.println();
//    System.out.println("Creando record de Pais");
//
//    Pais india = new Pais("Nueva Delhi", 1428);
//
//    System.out.println(india);
//    System.out
//        .println("india.poblacion = " + india.poblacion() + " india.capital =" + india.capital());
//
//  }

}
