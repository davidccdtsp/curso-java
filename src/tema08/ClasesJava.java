package tema08;

import controlAcceso.AnotherSample;
import controlAcceso.Ejemplo;
import controlAcceso.EjemploPorDefecto;
import controlAcceso.EjemploPrivado;
import controlAcceso.Pruebas;
// import controlAcceso.Sample;

public class ClasesJava {

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
    Coche coche = new Coche(1600, 310);

    coche.entrar(new Pasajero("A", 86), new Pasajero("B", 67), new Pasajero("C", 76));


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

}
