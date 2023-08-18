package tema13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;
import java.util.function.IntSupplier;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class ExpresionesLambda {

  public static void ejemplo01() {

    Runnable runnable = () -> System.out.println("Ejecutando lambda sobre Runnable.run()");
    Consumer<String> consumer =
        (s) -> System.out.println("Ejecutando lambad sobre Consumer.accept(T) = " + s);
    Predicate<Integer> predicate = (Integer i) -> {
      return i > 100;
    };

    runnable.run();
    consumer.accept("Java!!!");
    predicate.test(12);

    System.out.println("Ejecutando lambda sobre Predicate.test(T)");
  };

  public static void ejemplo02() {

    int entero = 12;

    // Consumer<Integer> consumer = i -> entero += i; // Error, entero debe ser final o effectively
    // final

  }

  public static void ejemplo03() {
    // Supplier

    System.out.println();
    System.out.println("Uso de Supplier<T> para generar numero aleatorios");

    Random random = new Random(314L);
    Supplier<Integer> newRandom = () -> random.nextInt(10);

    for (int index = 0; index < 5; index++) {
      System.out.println(newRandom.get() + " "); // Llamada al metodo get que ejecuta la lambda
    }

    System.out.println();
    System.out.println("Ejemplo de autoboxing");

    for (int i = 0; i < 5; i++) {
      int nextRandom = newRandom.get(); // Autobxing
      System.out.println(nextRandom);
    }

    System.out.println();
    System.out.println("Uso de InSupplier para generar numero aleatorios");

    IntSupplier otroRandom = () -> random.nextInt(10); // Imlementa getAsint() de IntSupplier

    for (int i = 0; i < 5; i++) {
      int nextRandom = otroRandom.getAsInt(); // Llamada a getAsint()
      System.out.println(nextRandom);
    }

  }

  public static void ejemplo04() {
    // Consumer

    System.out.println();
    System.out.println("Uso de Consumer para consumir datos de un array");

    int[] enteros = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    Consumer<Integer> impresor = (i) -> {
      if (i % 2 == 0)
        System.out.println(i + " es par");
      else
        System.out.println(i + " es impar");
    };

    for (int i = 0; i < 5; i++) {
      impresor.accept(enteros[i]);
    }

    System.out.println();
    System.out.println("Uso de IntConsumer para consumir datos de un array");

    IntConsumer impresorInt = i -> {
      if (i % 2 == 0)
        System.out.println(i + " es par");
      else
        System.out.println(i + " es impar");
    };

    for (int i = 0; i < 5; i++) {
      impresorInt.accept(enteros[i]); // La firma del metodo void accept(int value)
    }

    System.out.println();
    System.out.println("Uso de BiConsumer para consumir dos argumentos");

    Random random = new Random(314L);

    BiConsumer<Random, Integer> impresorNumerosAleatorios = (generador, limite) -> {
      for (int i = 0; i < limite; i++)
        System.out.println(generador.nextInt(10));
    };

    impresorNumerosAleatorios.accept(random, 5);

    System.out.println();
    System.out.println("Uso de Consumer con iterables");

    List<String> palabras = Arrays.asList("Expresiones", "Lambda", "en", "java");

    Consumer<String> impresorStrings = s -> System.out.println(s.toUpperCase());
    palabras.forEach(impresorStrings);
  }


  public static void ejemplo05() {
    // Predicate

    System.out.println();
    System.out.println("Uso de Predicate para comprobar numeros pares en un array");

    int[] numeros = {123, 456, 4, 908, 23, 345};

    Predicate<Integer> filtroPares = i -> i % 2 == 0; // Devuelve true el numero es par

    for (int i = 0; i < numeros.length; i++) {
      if (filtroPares.test(numeros[i]))
        System.out.println(numeros[i]);
    }

    System.out.println();
    System.out.println("Uso de IntPredicate para comprobar numeros pares en un array");

    IntPredicate filtroIntPares = i -> i % 2 == 0;

    for (int i = 0; i < numeros.length; i++) {
      if (filtroPares.test(numeros[i]))
        System.out.println(numeros[i]);
    }

    System.out.println();
    System.out.println("Uso de BiPredicate");

    BiPredicate<String, Integer> longitudMayorQue = (s, i) -> s.length() > i;
    boolean resultado = longitudMayorQue.test("HOLA", 3);

    System.out.println("HOLA.length*() > 3 = " + resultado);

    System.out.println();
    System.out.println("Uso de Predicate con removeIf");

    List<String> palabrasI = List.of("Expresiones", "prohibida", "Lambda", "en", "java");
    List<String> palabras = new ArrayList<>(palabrasI);
    Predicate<String> filtroString = s -> s.equals("prohibida");

    System.out.println(palabras);
    palabras.removeIf(filtroString);
    System.out.println(palabras);

  }

  public static void ejemplo06() {
    //  Function 
    System.out.println();
    System.out.println("Uso de Function<T,R> para mapeo de objetos");

    Function<String, Integer> mapLongitud = s -> s.length();
    String palabra = "Hello";
    int longitud = mapLongitud.apply(palabra);  // 5
    
    System.out.println("Longitud de la palabara 'Hello'= "+longitud);

    List<Integer> numeros = List.of(1,2,3,4,5);
    List<Integer> arrayListNumeros = new ArrayList<>(numeros);

    BiFunction<List<Integer>,Integer,List<Integer>> mapInicializa = (entrada, valor) -> {
      List<Integer> nuevaLista = new ArrayList<>(entrada);    // Copia de la lista original
      for(int i=0; i<nuevaLista.size(); i++)
        nuevaLista.set(i, valor);
      return nuevaLista; 
    };

    System.out.println();
    System.out.println("Unso de BiFunction para inicializar una ArrayList a un valor");
    System.out.println(arrayListNumeros);
    List<Integer> arryListInicializado = mapInicializa.apply(arrayListNumeros, 3);
    System.out.println(arryListInicializado);


  }

}
