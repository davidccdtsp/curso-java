package tema06;

public class Expresiones {

  public static void ejemplo01() {

    // Ejemplos de expresiones
    int edad = 18;
    boolean menorQue = 25 > 28;
    var edadLegal = edad>17 ? "Adulto" : "Menor";

    System.out.println("Edad = "+edad);
    System.out.println(edad +" > 28 = "+menorQue);
    System.out.println(edad+" se considera "+edadLegal);

    // Tipos de expresiones
    String expresion1 = "Hello " + "World";
    Integer expresion2 = 2 + 5;

    System.out.println("\"Hello \" + \"World\" es una expresion de tipo: "+expresion1.getClass());
    System.out.println("2 + 5 es una expresion de tipo: "+expresion2.getClass());

    // Expresion compuesta
    int expresion3 = 8 + 16 - 4;
    System.out.println("8 + 16 - 4 = "+expresion3);
    float expresion4 = 10f + 5f / 10f;
    System.out.println("15 + 5 / 10 = "+expresion4);

  }
  
}
