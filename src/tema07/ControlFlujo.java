package tema07;

import java.util.Arrays;


public class ControlFlujo {

  enum Pais {
    USA, GBR, ESP, FRA, ITA, DEU
  }

  public static void ejemplo01() {

    CuentaCorriente miCuenta = new CuentaCorriente();
    miCuenta.mostrarEstado();
    miCuenta.ingresar(1000);
    miCuenta.mostrarEstado();
    System.out.println("Intentando ingresar -1000€");
    miCuenta.ingresar(-1000);
    miCuenta.mostrarEstado();
    miCuenta.retirar(200);
    miCuenta.mostrarEstado();
    System.out.println("Intentado retirar 2000€");
    miCuenta.retirar(2000);
    miCuenta.mostrarEstado();
    System.out.println("Intentado retirar -100€");
    miCuenta.retirar(-200);
    miCuenta.mostrarEstado();

    System.out.println("Calculando riesgo hipotecario");
    String riesgo = miCuenta.calcularRiesgo(2000000);
    System.out.println("Riesgo hipotecario para 2000000: " + riesgo);
    riesgo = miCuenta.calcularRiesgo(20000);
    System.out.println("Riesgo hipotecario para 20000: " + riesgo);


  }

  public static void ejemplo02() {

    CuentaCorriente miCuenta = new CuentaCorriente();
    float[] intereses = miCuenta.simularIntereses(24, 20000, 0.002f);

    System.out.println(
        "Calculando intereses en un deposito a 24 meses, con un interes del 0.002 mensual sobre 20.000€");
    System.out.println(Arrays.toString(intereses));

    System.out.println("\n");
    int i = 0;
    System.out.println("Iniciando contador desde i = " + i + " hasta 10 con do-while");

    do {
      // Se ejecuta al menos una vez
      i++;
      System.out.println(i);
    } while (i < 10);

    i = 0;
    while (i < 10) {
      // Se ejecuta al menos una vez
      i++;
      System.out.println(i);
    } ;

  }

  public static void ejemplo03() {

    System.out.println("Contandor de 0 a 9 empleando For");

    // Contador de 0 a 9 empleando For
    for (int i = 0; i < 10; i++) {
      System.out.print(i + " ");

    }

    System.out.println("\n");
    System.out.println("Contandor de 10 a 20 empleando For");
    // Contador de 10 a 20 empleando For
    for (int i = 10; i <= 20; i++) {
      System.out.print(i + " ");
    }

    System.out.println("\n");
    System.out.println("Contandor de 10 a 0 empleando For");
    // Contador de 10 a 0 empleando For
    for (int i = 10; i >= 0; i--) {
      System.out.print(i + " ");
    }

    System.out.println("\n");
    System.out.println("Contandor sobre un array de int");

    // Otro modo de emplear for
    int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
    for (int item : numeros) {
      System.out.print(item + " ");
    }

  }

  public static void ejemplo04() {
    // Uso de switch

    System.out.println("Uso de switch para transformar un numero en su traduccion a un idioma");
    int numero = 2;

    switch (numero) {
      case 0:
        System.out.println("Cero");
        break;
      case 1:
        System.out.println("Uno");
        break;
      case 2:
        System.out.println("Dos");
        break;
      case 3:
        System.out.println("Tres");
        break;
      default:
        break;
    }

    System.out.println();

    String dia = "sabado";

    switch (dia) {
      case "viernes":
        System.out.println("Casi fin de semana");
        break;
//      case "sabado", "domingo":
//        System.out.println("Fin de semana");
      case "sabado":
      case "domingo":
    	  System.out.println("Fin de semana");
        break;
      case "lunes":
      case "martes":
        System.out.println("Primeros dias de la semana");
        break;
      default:
        System.out.println("Semana");
        break;
    }



    // Ejemplo switch expresion
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

//    pais = Pais.DEU;
//    codigoPais = switch (pais) {
//      case USA -> 840;
//      case GBR -> 626;
//      case ESP -> 724;
//      case FRA -> 250;
//      case ITA -> 380;
//      case DEU -> 276;
//      default -> 0;
//    };

    System.out.println("Ejemplo de uso de switch expression");
    System.out.println("El codigo de pais para " + pais + " es " + codigoPais);

  }

  public static void ejemplo05() {


    int i = 0;
    while (true) { // Bucle infinito
      System.out.println(i);
      i++;
      if (i == 5) // Finaliza el while
        break;
    }

    System.out.println();

    i = 0;

    do {
      System.out.println(i);
      i++;
      if (i == 5) // Finaliza el while
        break;
    } while (true);

    System.out.println();


    for (int j = 0; j < 10; j++) {
      System.out.println(i);
      if (j == 5) // Finaliza el for
        break;
    }

    System.out.println();

    etiqueta: for (i = 0; i < 10; i++) {
      for (int j = 0; j < 100; j++) {
        System.out.println(i + "-" + j);
        if (j == 3)
          break etiqueta;
      }
    }

  }

  public static void ejemplo06() {

    // Si la iteracion es par pasa a la siguiente
    for (int i = 0; i < 10; i++) {
      if (i % 2 == 0)
        continue;
      System.out.println(i);
    }

    System.out.println();

    char[][] matriz =
        {{'j', '*', 'c', 'd'}, {'a', 'v', '*', 'r'}, {'a', '*', 'u', 'i'}, {'*', 'h', 't', 'm'}};

    etiqueta: for (int i = 0; i < 4; i++)
      for (int j = 0; j < 4; j++) {
        if (matriz[i][j] == '*')
          continue etiqueta;
        System.out.print(matriz[i][j]);
      }

    System.out.println();
  }

    // A partir de Java SE 13
//  public static void ejemplo07() {
//
//    String dia = "lunes";
//    String resultado;
//
//    resultado = switch (dia) {
//      case "sabado", "domingo" -> "Fin de semana";
//      default -> {
//        yield "Semana";
//      }
//    };
//
//    System.out.println(resultado);
//
//  }

}
