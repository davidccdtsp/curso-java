package tema10.interfaces;

import java.util.Collection;
import java.util.List;
import tema10.Bizum;
import tema10.MiClase;

public class Interfaces {

  public static void ejemplo01() {
    // Implementacion de una interfaz

    InterfaceCartera miCartera = new Bizum();
    // Bizum miCartera = new Bizum();

    System.out.println();
    System.out.println("Ingresando 1000.00€");
    miCartera.ingresarFondos(1000, "uno");
    float saldo = miCartera.consultarFondos("uno");
    System.out.println("Nuevo saldo: " + saldo);
    System.out.println("Enviando 100.50€ a la cuenta destino");
    saldo = miCartera.enviarFondos(100.50f, "uno", "destino");
    System.out.println("Nuevo saldo: " + saldo);

  };

  public static void ejemplo02() {

    // Llamando a metodo estatico
    System.out.println();
    System.out.println("Llamando a metodo estatico de interfaz");
    InterfazPrueba.metodoEstatico();


  };

  public static void ejemplo03() {
    // Ejemplo implementacion interfaz

    MiClase miClase = new MiClase();

    int valor = miClase.foo();

    System.out.println();
    System.out.println("Llamando a metodo default");
    System.out.println(valor);
    System.out.println("Llamando a metodo implementado");
    miClase.metodo();
  };

  public static void ejemplo04() {
    // Sobreescritura metodos default

    class ClaseA implements InterfazA {};
    class ClaseB implements InterfazA {};
    class ClaseC implements InterfazA {
      public void foo() {
        System.out.println("Metodo foo redeclarado en C, ahora es abstract");
      }
    };

    ClaseA objetoA = new ClaseA();
    ClaseB objetoB = new ClaseB();
    ClaseC objetoC = new ClaseC();

    System.out.println();
    System.out.println(
        "Se crean tres objetos a, b y c, los cuyas clases implementan las interfaces A, B y C");
    objetoA.foo(); // Metodo original
    objetoB.foo(); // Metodo redefinido
    objetoC.foo(); // Metodo redeclarado

  };

  public static void ejemplo05() {
    // Interfacs como tipos

    class ClaseA implements InterfazA {
    	
    	final static int CONSTANTE = 1;
    	
    	private String nombre;


	public void metodoA() {
        System.out.println("Metodo propio de la ClaseA");
      };
    };

    class ClaseB implements InterfazA, InterfazB {
      public void metodoB() {
        System.out.println("Metodo propio de la ClaseB");
      };
    };

    InterfazB variable = new ClaseB();
    ClaseA objetoA = new ClaseA();
    ClaseB objetoB = new ClaseB();
   

    System.out.println();
    objetoA.metodoA();   
    objetoA.foo();
    objetoB.metodoB();
    objetoB.foo();
//    variable.foo();
    variable.defaultB();
    objetoB.defaultB();
//    ClaseB cosa = (ClaseB)variable;
//    cosa.metodoB();
//    referencia.metodoB();   // Error, metodo no definido

  };


  public static void ejemplo06(){
    // Interfaces Sealed

    // class ClaseA implements InterfazSealed{};   // Error, ClaseA no permitida
    class ClaseA implements InterfazA{};
    

    System.out.println();

  };



}
