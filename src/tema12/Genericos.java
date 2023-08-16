package tema12;

import tema12.interfaces.InterfazA;
import tema12.interfaces.InterfazB;
import tema12.interfaces.InterfazC;

public class Genericos {

  public static void ejemplo01() {

    class A {
      public String toString() {
        return "Objeto clase A";
      };
    }; // Clase local

    Caja caja = new Caja();
    CajaGenerica<String> cajaGenerica = new CajaGenerica<String>();
    A objeto = new A();

    System.out.println();
    System.out.println("Creada Caja caja");

    caja.set("Hola");
    System.out.println("Añadiendo un String: " + caja.get());
    caja.set(2);
    System.out.println("Añadiendo un Integer: " + caja.get());
    caja.set(objeto);
    System.out.println("Añadiendo un objeto de la clase A: " + caja.get());

    System.out.println();
    System.out.println("Creada CajaGeneric<String> cajaGenerica");

    cajaGenerica.set("Hola");
    System.out.println("Añadiendo un String: " + cajaGenerica.get());

    // cajaGenerica.set(1); // Error
    // cajaGenerica.set(objeto); // Error

    System.out.println();
    System.out.println("Creada CajaGeneric<A> cajaGenericaB");

    // cajaGenerica = new CajaGenerica<A>(); // Error
    CajaGenerica<A> cajaGenericaB = new CajaGenerica<A>();
    cajaGenericaB.set(objeto);

  };

  public static void ejemplo02() {
    // Multiples parametros

    Par<Integer, String> par = new Par<Integer, String>(5, "Cinco");
    // Par<Integer, String> par = new Par<>(5, "Cinco"); // Infiriendo los tipos automaticamente

    System.out.println();
    System.out.println("Creado objeto de la clase Par<K,V> par<Integer, String>");
    System.out.println("par.getClave() = " + par.getClave());
    System.out.println("par.getValor() = " + par.getValor());

  };


  public static void ejemplo03() {
    // Pasando tipos parametrizados

    CajaGenerica<String> caja = new CajaGenerica<String>();
    Par<String, CajaGenerica<String>> par = new Par<String, CajaGenerica<String>>("Clave", caja);

    caja.set("Hola");

    System.out.println();
    System.out.println("Creada una instancia de CajaGenercia<String>");
    System.out.println("Creada una instancia de Par<String, CajaGenerica<String>>");



  };

  public static void ejemplo04() {
    // Tipo RAW
    CajaGenerica box = new CajaGenerica<>();
    CajaGenerica<String> boxA = new CajaGenerica<String>();

    box.set("Raw");
    boxA.set("Texto");
    CajaGenerica boxB = boxA; // OK

    CajaGenerica<Integer> boxC = box; // Warning, conversion no comprobada
    // var valor = boxC.get(); // Error en tiempo de ejecucion

    CajaGenerica<String> boxD = box; // Warning, conversion no comprobada
    var valor = boxD.get(); // Ok

    System.out.println();
    System.out.println("Creando un tipo raw de CajaGenerica");
    System.out.println("CajaGenerica box -> get() = " + box.get());
    System.out.println("CajaGenerica<String> boxA -> get() = " + boxA.get());
    System.out.println("CajaGenerica boxB = boxA");
    System.out.println("CajaGenerica boxB -> get() = " + boxB.get());

  };

  public static void ejemplo05() {

    class Clase<T1, T2> {
      public T1 foo(T1 param1, T2 param2) {
        System.out.println("Parametro 1 " + param1 + " de tipo " + param1.getClass());
        System.out.println("Parametro 2 " + param2 + " de tipo" + param2.getClass());
        return param1;
      }
    }

    System.out.println();
    System.out.println("Probando metodo generico");

    Clase<Integer, Boolean> generica = new Clase<Integer, Boolean>();
    Integer retorno = generica.foo(25, false);

    System.out
        .println("El valor devuelto por el metodo es " + retorno + " de tipo" + retorno.getClass());


    class OtraClase {
      public <T1 extends Number> T1 foo(T1 num1, T1 num2) {

        System.out.println("Parametro 1 " + num1 + " de tipo " + num1.getClass());
        System.out.println("Parametro 2 " + num2 + " de tipo" + num2.getClass());
        // Logica del metodo
        return num1;
      }
    }

    OtraClase otra = new OtraClase();

    System.out.println();
    System.out.println("Probando metodo con tipos acotados");

    otra.foo(25, 56);
    // otra.foo("texto","texto"); // Error de compilacion


  };

  public static void ejemplo06() {

    class Clase {
      public static <T1 extends InterfazA, InterfazB, InterfazC> void foo(T1 num1, T1 num2) {

      }
    }

    class A implements InterfazA {
    };
    class B implements InterfazA, InterfazB, InterfazC {
    };
    class C implements InterfazA {
    };

    Clase clase = new Clase();
    A a = new A();
    B b = new B();
    C c = new C();

    Clase.foo(a, a);
    Clase.foo(b, b);
    Clase.foo(c, c);
    // Class.foo("texto","10"); // Error

  }

  public static void ejemplo07() {
    // Subtipos

    class Clase<T> {

      void foo(T param) {
        System.out.println("Llamando a metodo generico foo(T param) con T = " + param.getClass());
      };

      public String toString() {
        return "dasfa" + this.getClass();
      }

      void prueba(Clase<Number> param) {
        System.out.println(param);
      };

    };

    Clase<Number> instanciaClase = new Clase<Number>();
    Clase<Integer> instanciaClase2 = new Clase<Integer>();

    System.out.println();
    System.out.println();

    instanciaClase.foo(Integer.valueOf(100)); // Integer
    instanciaClase.foo(Double.valueOf(0.789)); // Double

    System.out.println();

    instanciaClase.prueba(instanciaClase);
    // instanciaClase.prueba(instanciaClase2); // Error de tipos

  };

  public static void ejemplo08() {
    // Inferencia de tipos

    class Demo {
      static <U> void foo(U u) {
        System.out.println("Ejecutando metodo <U>foo(U u) sobre el tipo " + u.getClass());
      };

      static <T> CajaGenerica<T> empaquetar(T t) {
        System.out.println("Ejecutando metodo empaquetar sobre el tipo " + t.getClass());
        return new CajaGenerica<T>();
      }

      static <T> void desempaquetar(CajaGenerica<T> caja){
        System.out.println("Desempaquetando caja del tipo "+caja.getClass().getName());
      } 
    };

    System.out.println();

    Demo.<Double>foo(Double.valueOf(0.123));  // Sin inferencia de tipos
    // Demo.<Double>foo("Error");                // Error, Double vs String
    Demo.foo(Integer.valueOf(11));            // Integer
    Demo.foo(1);                              // Integer
    Demo.foo("Hola");                         // String

    System.out.println();
    System.out.println("Usando inferencia en constructores");

    // Inferencia en instanciacion de clases
    CajaGenerica<String> cajaString = new CajaGenerica<String>();      // Sin inferencia
    CajaGenerica<String> cajaString2 = new CajaGenerica<>();           // Con inferencia: String
    // CajaGenerica<> cajaString3 = new CajaGenerica<String>();        // Error
    // CajaGenerica<String> cajaString4 = new CajaGenerica<Integer>(); // Error

    System.out.println();
    CajaGenerica<String> caja1 = Demo.<String>empaquetar("String");   // Sin inferencia
    CajaGenerica<String> caja2 = Demo.empaquetar("Texto");            // String -> CajaGenerica<String>
    CajaGenerica<Integer> caja3 = Demo.empaquetar(22);                // Integer -> CajaGenerica<Integer>
    // CajaGenerica<> caja4 = Demo.empaquetar("Texto");                  // Error
    // CajaGenerica<Integer> caja5 = Demo.empaquetar("Texto");           // Error

    System.out.println();

    CajaGenerica caja = Demo.empaquetar("Adios");
    Demo.desempaquetar(caja);                                             // Desde Java SE8, infiere CajaGenerica<String>

  };

  public static void ejemplo09() {
    // Comodines (wildcards)

    class Wildcard {

      // Metodo con comodin acotado
      static void metodo1(CajaGenerica<? extends Number> caja){
        System.out.println("Ejecutando metodo con metodo1(CajaGenerica<? extends Number> num)");
      };

      static void metodo2(CajaGenerica<Number> caja){
        System.out.println("Ejecutando metodo metodo2(CajaGenerica<Number> num)");
      };

      // Metodo con comodin no acotado, emplea el metodo hashCode de Object
      static void metodo3(CajaGenerica<?> caja){
        System.out.println("Imprimiendo hashCode: "+caja.hashCode());
      }

      // Metodo con comodin no acotado
      static void metodo4(CajaGenerica<?> caja){
        System.out.println(caja.describir());
      }

      // Metodo con comodin acotado inferiormente
      static void metodo5(CajaGenerica<? super Number> caja){
        System.out.println("Ejecutando metodo metodo5(CajaGenerica<?> caja)");
      };
    };

    CajaGenerica<Integer> cajaEnteros = new CajaGenerica<>();
    CajaGenerica<Number> cajaNumeros = new CajaGenerica<>();

    System.out.println();
    System.out.println("Creadas CajaGenerica<Integer> cajaEnteros y CajaGenerica<Number> cajaNumeros");

    Wildcard.metodo1(cajaNumeros);
    Wildcard.metodo1(cajaEnteros);    // permitido, Integer es subclase de Number
    Wildcard.metodo2(cajaNumeros);

    CajaGenerica<String> cajaCadenas = new CajaGenerica<>();

    cajaCadenas.set("Genericos");

    System.out.println();
    System.out.println("Creada CajaGenerica<String> cajaCadenas");
    System.out.println("Salida de metodo3(CajaGenerica<?>)");
    Wildcard.metodo3(cajaEnteros);
    Wildcard.metodo3(cajaCadenas);

    System.out.println();
    System.out.println("Salida de metodo4(CajaGenerica<?>)");

    Wildcard.metodo4(cajaEnteros);
    Wildcard.metodo4(cajaCadenas);

    CajaGenerica<Object> cajaObjetos = new CajaGenerica<>();

    System.out.println();
    Wildcard.metodo5(cajaNumeros);
    Wildcard.metodo5(cajaObjetos);
    // Wildcard.metodo5(cajaEnteros);    // Error, Integer es subclase de Number


  }
}
