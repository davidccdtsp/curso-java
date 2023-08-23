package tema14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.DoubleUnaryOperator;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;
import java.util.function.IntSupplier;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.logging.Logger;

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
    // Function
    System.out.println();
    System.out.println("Uso de Function<T,R> para mapeo de objetos");

    Function<String, Integer> mapLongitud = s -> s.length();
    String palabra = "Hello";
    int longitud = mapLongitud.apply(palabra); // 5

    System.out.println("Longitud de la palabara 'Hello'= " + longitud);

    List<Integer> numeros = List.of(1, 2, 3, 4, 5);
    List<Integer> arrayListNumeros = new ArrayList<>(numeros);

    BiFunction<List<Integer>, Integer, List<Integer>> mapInicializa = (entrada, valor) -> {
      List<Integer> nuevaLista = new ArrayList<>(entrada); // Copia de la lista original
      for (int i = 0; i < nuevaLista.size(); i++)
        nuevaLista.set(i, valor);
      return nuevaLista;
    };

    System.out.println();
    System.out.println("Unso de BiFunction para inicializar una ArrayList a un valor");
    System.out.println(arrayListNumeros);
    List<Integer> arryListInicializado = mapInicializa.apply(arrayListNumeros, 3);
    System.out.println(arryListInicializado);

  }

  public static void ejemplo07() {
    // Lambdas com referencias a metodos

    class Demo {

      static final Demo objetoDemo = new Demo("Objeto demo");
      String palabra;

      public Demo(String palabra) {
        this.palabra = palabra;
      }

      static void escribe(String valor) {
        System.out.println("Escribiendo " + valor.toUpperCase());
      }

      String getPalabra() {
        return palabra;
      }

      void print(String s) {
        System.out.println(s);
      }

    }

    Consumer<String> impresora = System.out::println;
    impresora.accept("hola");

    // Consumer<String> escribe = s -> Demo.escribe(s);
    Consumer<String> escribe = Demo::escribe;
    DoubleUnaryOperator sqrt = Math::sqrt;

    System.out.println("Uso de expresiones lambda como referencias a metodos");
    System.out.println("Consumer<String> escribe = Demo::escribe;");
    escribe.accept("Hola");

    double resultado = sqrt.applyAsDouble(64);
    System.out.println("\nDoubleUnaryOperator sqrt = Math::sqrt;");
    System.out.println("raiz de 64 = " + resultado);


    // Function<Demo,String> getPalabra = d -> d.getPalabra();
    Function<Demo, String> getPalabra = Demo::getPalabra;
    Demo demo = new Demo("Lambdas");
    String palabra = getPalabra.apply(demo);

    System.out.println("\nUso de expresiones lambda sobre metodos no enlazados");
    System.out.println("Function<Demo,String> getPalabra = Demo::getPalabra");
    System.out.println(palabra);

    // BiFunction<String, String, Integer> indexOf = (sentence, word) -> sentence.indexOf(word);
    BiFunction<String, String, Integer> indexOf = String::indexOf;
    int indice = indexOf.apply("hola mundo", "mundo");

    System.out.println("\nEjemplo usando BiFuncion<>");
    System.out.println(indice);

    System.out.println("\nEjemplo de referencia enlazada a metodo");

    // Consumer<String> demoPrint = s -> Demo.objetoDemo.print(s);
    Consumer<String> demoPrint = Demo.objetoDemo::print;
    demoPrint.accept("Java");

    System.out.println("\nEjemplo de referencia a constructor");

    // Function<String,Demo> constructorDemo = s -> new Demo(s);
    Function<String, Demo> constructorDemo = Demo::new;
    Demo nuevoDemo = constructorDemo.apply("palabra");

    System.out.println("Creado objeto Demo(" + nuevoDemo.getPalabra() + ")");

    // Ejemplo con Supplier para generar ArrayList
    // Supplier<List<String>> newListOfStrings = () -> new ArrayList<>();
    Supplier<List<String>> newListOfStrings = ArrayList::new;
    List<String> nuevaLista = newListOfStrings.get();

  }

  public static void ejemplo08() {
    // Combinando lambdas

    Predicate<String> nonNull = s -> s != null;
    Predicate<String> nonEmpty = s -> !s.isEmpty();
    Predicate<String> shorterThan5 = s -> s.length() < 5;

    Predicate<String> p = nonNull.and(nonEmpty).and(shorterThan5);
    boolean resultado = p.test("Nube");


    System.out.println();
    System.out
        .println("Creada lambda para comprobar que un string no es nulo, menor que 5 y no vacio");
    System.out.println("Nube -> " + p.test("Nube"));
    System.out.println("Nube -> " + p.test("Ballena"));
    System.out.println("Nube -> " + p.test(""));

    Predicate<String> isNull = Objects::isNull;
    Predicate<String> isEmpty = String::isEmpty;
    Predicate<String> isNullOrEmpty = isNull.or(isEmpty);
    Predicate<String> isNotNullNorEmpty = isNullOrEmpty.negate();

    p = isNotNullNorEmpty.and(shorterThan5);

    System.out.println();
    System.out.println("Creada lambda para comprobar que un string NO es null o vacio");
    System.out.println("Nube -> " + p.test("Nube"));
    System.out.println("Nube -> " + p.test(null));
    System.out.println("Nube -> " + p.test(""));

    Predicate<String> isEqualToDuke = Predicate.isEqual("Duke");

    Predicate<Collection<String>> colIsEmpty = Collection::isEmpty;
    Predicate<Collection<String>> colIsNotEmpty = Predicate.not(colIsEmpty);

    Collection<String> lista = new ArrayList<String>();
    colIsEmpty.test(lista);
    colIsNotEmpty.test(lista);

    System.out.println("\nCombinando lambdas usando metodos factoria");
    System.out.println("Creada una lista de String");
    System.out.println("La lista es vacia: " + colIsEmpty.test(lista));
    System.out.println("La lista NO es vacia: " + colIsNotEmpty.test(lista));

    // Consumer -> andThen
    Logger logger = Logger.getLogger("MyApplicationLogger");
    Consumer<String> log = message -> logger.info(message);
    Consumer<String> print = message -> System.out.println(message);

    Consumer<String> printAndLog = log.andThen(print);

    System.out.println("\nEncadenndo lambdas con Consumer andThen");
    printAndLog.accept("HOLA");

    // Function
    Consumer<String> mayusculas = palabra -> System.out.println(palabra.toUpperCase());
    Consumer<String> imprime = palabra -> System.out.println(palabra);

    Consumer<String> imprimeMayus = mayusculas.andThen(imprime);
    imprimeMayus.accept("cadena en minusculas");

    System.out.println("\nCombiando y encadenando metodos default ");

    Function<String, String> minusculas = palabra -> palabra.toLowerCase();
    Function<String, String> concatena = palabra -> palabra.concat("-SUFIJO");

    Function<String, String> combinado = minusculas.andThen(concatena);
    String resul = combinado.apply("tEXto");

    System.out.println(resul);

    Function<String, String> combinadoB = minusculas.compose(concatena);
    var cosa = combinadoB.apply("tEXto");

    System.out.println(cosa);

  }

  public static void ejemplo09() {
    // Comparadores
    class Demo {
      int valor;
      int valor2;

      Demo(int valor, int valor2) {
        this.valor = valor;
        this.valor2 = valor2;
      }

      Demo(int valor) {
        this(valor, 0);
      }


      Integer mod7() {
        return valor % 7; // Mod 7
      }
    }

    // Comparator<Integer> comparator = (i1, i2) -> Integer.compare(i1, i2);
    Comparator<Integer> comparator = Integer::compare;
    int resultado = comparator.compare(12, 31);

    System.out.println("\nImplemntando un comparador con la Interfaz Compare");
    System.out.println("12 comparado con 31 = " + resultado);

    Comparator<Demo> comparadorDemos = (d1, d2) -> Integer.compare(d1.valor, d2.valor);
    resultado = comparadorDemos.compare(new Demo(12), new Demo(31));

    System.out.println("\nImplemntando un comparador de objetos DEMO");
    System.out.println("Demo(12) comparado con Demo(31) = " + resultado);

    // Comparator<Demo> comparadorDemosMod7 = (d1,d2) -> Integer.compare(d1.mod7(), d2.mod7());
    Comparator<Demo> comparadorDemosMod7 = Comparator.comparing(Demo::mod7);
    resultado = comparadorDemosMod7.compare(new Demo(12), new Demo(31));

    System.out.println("\nImplementando un comparador con comparing()");
    System.out.println("Comparando modulo 7. Demo(12) comparado con Demo(31) = " + resultado);

    // Encadenando comparadores

    Comparator<Demo> comparadorDemos2 = (d1, d2) -> Integer.compare(d1.valor2, d2.valor2);
    Comparator<Demo> comparadorEncadenado = comparadorDemos.thenComparing(comparadorDemos2);
    resultado = comparadorEncadenado.compare(new Demo(1, 12), new Demo(1, 5));

    System.out.println("\nEncadenando comparadores");
    System.out.println("Demo(1,12) compare Demo(1,5) = " + resultado);

    // Usando orden natural con lambdas para comaprar
    List<String> meses =
        Arrays.asList("Java", "TypeScript", "Rust", "Go", "C++", "Switf", "Scala", "Haskell");
    Comparator<String> ordenNatural = Comparator.naturalOrder();
    Comparator<String> tamanoDespuesOrdenNatural =
        Comparator.comparing(String::length).thenComparing(Comparator.naturalOrder());

    System.out.println("\nList<String> original:");
    System.out.println(meses);

    meses.sort(ordenNatural);
    System.out.println("\nOrdenado en base al orden natural de String");
    System.out.println(meses);
    meses.sort(tamanoDespuesOrdenNatural);
    System.out.println("\nOrdenando en base al tamano y luego al orden natural");
    System.out.println(meses);

    class DemoComparable implements Comparable {
      int valor;

      DemoComparable(int valor) {
        this.valor = valor;
      }

      int getValor() {
        return valor;
      }

      @Override
      public String toString() {
        return "Demo-" + Integer.toString(valor);
      }

      @Override
      public int compareTo(Object o) {
        Integer val = valor;
        if ((o instanceof DemoComparable)) {
          DemoComparable demoComparable = (DemoComparable) o;
          return val.compareTo(demoComparable.valor);
        } else
          return 0;
      }
    }

    DemoComparable demoC1 = new DemoComparable(564);
    DemoComparable demoC2 = new DemoComparable(456);
    DemoComparable demoC3 = new DemoComparable(89);

    List<DemoComparable> demos = Arrays.asList(demoC1, demoC2, demoC3);

    Comparator<DemoComparable> demoComparableNatural = Comparator.naturalOrder();
    Comparator<Integer> comparadorMod2 = (i1, i2) -> Integer.compare(i1 % 2, i2 % 2);
    Comparator<DemoComparable> comparaMod2YNatural =
        Comparator.comparing(DemoComparable::getValor, comparadorMod2)
            .thenComparing(Comparator.naturalOrder());


    System.out.println("\nList<DemoComparable>:");
    System.out.println(demos);

    demos.sort(demoComparableNatural);
    System.out.println("\nOrdenando en base al orden natural");
    System.out.println(demos);
    demos.sort(comparaMod2YNatural);
    System.out.println("\nOrdenando mod 2 y despues en base al orden natural");
    System.out.println(demos);

    List<String> dias =
        Arrays.asList("lunes", "martes", "miercoles", "jueves", "viernes", "sabado", "domingo");
    Comparator<String> stringNatural = Comparator.naturalOrder();


    System.out.println("\nList<String>:");
    System.out.println(dias);
    dias.sort(stringNatural.reversed());
    System.out.println("Ordenando inversamente:");
    System.out.println(dias);


    // Valores nulos
    Comparator<String> comparadorA = (s1, s2) -> {
      if (s1 == null && s2 != null)
        return 1;
      if (s1 != null && s2 == null)
        return -1;
      if (s1 == null && s2 == null)
        return 0;
      else
        return s1.compareTo(s2);
    };

    Comparator<String> comparadorB = Comparator.nullsLast(Comparator.naturalOrder());

    List<String> marcas =
        Arrays.asList("Nvidia", "Apple", "Nike", null, "koenigsegg", null, "Primark");

    System.out.println("List<String>:");
    System.out.println(marcas);

    marcas.sort(comparadorA);
    System.out.println("Nulos al final con comparador complejo:");
    System.out.println(marcas);
    marcas.sort(comparadorB);
    System.out.println("Nulos al final con nullLast:");
    System.out.println(marcas);

  }
}
