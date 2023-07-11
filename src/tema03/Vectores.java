package tema03;

import java.util.Arrays;
import java.util.function.DoubleConsumer;
import java.util.stream.DoubleStream;

public class Vectores {

  public static void ejemplo01() {

    // Declaraci'on de Array de integer
    int[] arrayEnteros;
    int otroArray[];

    // Creacion del array
    arrayEnteros = new int[10];

    System.out.println("\n" + arrayEnteros[0]);
    System.out.println(arrayEnteros[1]);
    System.out.println(arrayEnteros[2]);

    arrayEnteros[0] = 100;
    arrayEnteros[1] = 200;
    arrayEnteros[2] = 300;

    System.out.println("\n" + arrayEnteros[0]);
    System.out.println(arrayEnteros[1]);
    System.out.println(arrayEnteros[2]);

    int n = arrayEnteros[1];

    // Esto lanzara una excepcion
    // arrayEnteros[11] = 200;

    // Array de tamano 4
    String[] arrayCadenas = {"C++", "Python", "Java", "Haskell"};

    System.out.println("\n" + arrayCadenas[0]);
    System.out.println(arrayCadenas[1]);
    System.out.println(arrayCadenas[2]);
    System.out.println(arrayCadenas[3]);

    // Array multidimensional
    int[][] matriz = {{1, 2, 3}, {4, 5, 6}};

    System.out.println("\n[" + matriz[0][0] + " |" + matriz[0][1] + " |" + matriz[0][2] + "]");
    System.out.println("[" + matriz[1][0] + " |" + matriz[1][1] + " |" + matriz[1][2] + "]");

  }

  public static void ejemplo02() {

    // Array de tamano 4
    String[] lenguajes = {"C++", "Python", "Java", "Haskell"};
    String[] algunosLenguajes = new String[4];

    System.out.println("String[] = lenguajes ");
    System.out.println(lenguajes[0]);
    System.out.println(lenguajes[1]);
    System.out.println(lenguajes[2]);
    System.out.println(lenguajes[3]);

    // Copia dsde la posici'on 2 de lenguajes los 2 siguientes elementos en algunosLenguajes
    System.arraycopy(lenguajes, 2, algunosLenguajes, 0, 2);

    System.out.println("\narraycopy(lenguajes, 2, algunosLenguajes, 0, 2)");
    System.out.println(algunosLenguajes[0]);
    System.out.println(algunosLenguajes[1]);
    System.out.println(algunosLenguajes[2]);
    System.out.println(algunosLenguajes[3]);

    // Lanzazra una excepcion, al salirse del indice del array destio
    // System.arraycopy(lenguajes, 3, algunosLenguajes, 0, 2);

    int[] numeros = {1, 2, 3};
    int[] otrosNumeros = numeros;

    numeros[1] = 0;
    System.out.println(numeros[1] + " = " + otrosNumeros[1]);

    String[] palabras = {"Orbita", "Graveda"};
    String[] otrasPalabras = palabras;

    palabras[0] = "Materia oscura";
    System.out.println(palabras[0] + " = " + otrasPalabras[0]);
    System.out.println(palabras + " = " + otrasPalabras);

    int a = 34;
    int b = a;

    a = 44;
    System.out.println(a + " != " + b);

  }

  public static void ejemplo03() {


    String[] cafes = {"Affogato", "Americano", "Cappuccino", "Corretto", "Cortado", "Doppio",
        "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato", "Marocchino", "Ristretto"};

    String[] copiaCafes = java.util.Arrays.copyOfRange(cafes, 2, 9);

    // Copia manual
    String[] otraCopiaCafes = new String[7];
    for (int i = 2; i < 9; i++) {
      otraCopiaCafes[i - 2] = cafes[i];
    }

    System.out.println("\nArray original: ");
    java.util.Arrays.stream(cafes).map(coffee -> coffee + " ").forEach(System.out::print);
    System.out.println("\nArray copiado con copyOfRange: ");
    java.util.Arrays.stream(copiaCafes).map(coffee -> coffee + " ").forEach(System.out::print);
    System.out.println("\nArray copiado manualmente: ");
    java.util.Arrays.stream(otraCopiaCafes).map(coffee -> coffee + " ").forEach(System.out::print);
    System.out.println();

    // Ejemplo toString
    System.out.println("\nImprimendo contenido con Arrays.toString():");
    String cafesString = Arrays.toString(cafes);
    System.out.println(cafesString);

    // Ejemplo binarySearch
    System.out.println("\nUsando binarySearch(\"Frappucino\"):");
    System.out.println(Arrays.toString(cafes));
    int i = Arrays.binarySearch(cafes, "Frappucino");
    System.out.println("cafes[" + i + "] = " + cafes[i]);

    // Ejemplo equals
    System.out.println("\nEjemplo Arrays.equals():");
    System.out.println("Cafes -> " + Arrays.toString(cafes));
    System.out.println("CopiaCafes -> " + Arrays.toString(copiaCafes));
    System.out.println("OtraCopiaCafes -> " + Arrays.toString(otraCopiaCafes));

    boolean comparacionA = Arrays.equals(cafes, copiaCafes);
    boolean comparacionB = Arrays.equals(otraCopiaCafes, copiaCafes);

    System.out.println("Cafes == CopiaCafes? :" + comparacionA );
    System.out.println("OtraCopiaCafes == CopiaCafes? :" + comparacionB);

    // Ejemplo fill
    System.out.println("\nEjemplo Arrays.fill():");
    int numeros[] = new int[10];
    System.out.println("numeros = " + Arrays.toString(numeros));
    Arrays.fill(numeros, 7);
    System.out.println("fill(numeros,7)");
    System.out.println("numeros = " + Arrays.toString(numeros));


    // Ejemplo sort
    System.out.println("\nEjemplo Arrays.sort()");
    String[] cafesDesordenados =
        {"Frappucino", "Cappuccino", "Lungo", "Affogato", "Corretto", "Ristretto", "Cortado",
            "Marocchino", "Doppio", "Freddo", "Espresso", "Macchiato", "Americano",};
    System.out.println("Cafes -> " + Arrays.toString(cafesDesordenados));
    Arrays.sort(cafesDesordenados);
    System.out.println("Cafes (ordenados)-> " + Arrays.toString(cafesDesordenados));

    // Ejemplo parallelSort
    System.out.println("\nEjemplo Arrays.parallelSort()");
    int[] numerosDesordenados = {9, 8, 7, 6, 3, 1};
    System.out.println("Numeros -> " + Arrays.toString(numerosDesordenados));
    Arrays.parallelSort(numerosDesordenados);
    System.out.println("Numeros (ordenados) -> " + Arrays.toString(numerosDesordenados));

    // Ejemplo stream
    System.out.println("\nEjemplo Arrays.stream()");
    double[] compra = {12.99, 20.00, 45.90, 600};
    System.out.println("Precios -> "+Arrays.toString(compra));
    DoubleStream stream = Arrays.stream(compra);
    System.out.print("Precios con IVA -> [");
    stream.forEach(precio -> System.out.printf("%.2f, ",precio*1.21));
    System.out.print("]");

  }

}
