package tema17;

import java.util.ArrayList;
import java.util.List;

public class Anotaciones {

  public static void ejemplo01() {
    System.out.println("Llamando al metodo1 anotado como \"deprecated\"");
    Clase clasePruebas = new Clase();
    clasePruebas.metodo1();
  }

  public static void ejemplo02() {
    Principal clasePrincipal = new Principal();
    Secundaria claseSecundaria = new Secundaria();

    clasePrincipal.foo();
    System.out.println("Llamando al metodo sobreescrito");
    claseSecundaria.foo();

    System.out.println("Llamando al metodo int suma(int i, int j) de Principal");
    int res = clasePrincipal.suma(3, 5);
    System.out.println("suma(3,5) = " + res);

    System.out.println("Llamando al metodo sobreescrito int suma(int i, int j) de Secundaria");
    res = claseSecundaria.suma(3, 5);
    System.out.println("suma(3,5) = " + res);

    System.out.println("Llamando al metodo int suma(int i, int j, int k) de Principal");
    res = clasePrincipal.suma(3, 5, 10);
    System.out.println("suma(3,5,10) = " + res);

    System.out
        .println("Llamando al metodo NO sobreescrito int suma(int i, int j, int k) de Secundaria");
    res = claseSecundaria.suma(3, 5, 10);
    System.out.println("suma(3,5,10) = " + res);
  }

  public static void ejemplo03() {
    System.out.println("Ejemplos de SuppressWarnings");

    Clase clasePruebas = new Clase();
    clasePruebas.metodoConWarnings();
    clasePruebas.metodoConMasWarnings();

  }

  public static void ejemplo04(){
    System.out.println("Usando @SafeVarargs");
    List<String> lista = Clase.crearLista("uno","dos", "tres");
    System.out.println(lista);
  }

  public static void ejemplo05(){

    @MiAnotacion(
      nombre = "NombreClsase",
      valor = 20,
      palabrasClave = {"uno","dos","tres"}
    )
    class MiClase{

    }
  }



}

