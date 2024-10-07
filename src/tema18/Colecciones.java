package tema18;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

public class Colecciones {

  public static void ejemplo01() {

    Collection<String> coleccion = new ArrayList<String>();

    System.out.println("\nColeccion vacia:");
    System.out.println(coleccion);

    coleccion.add("Larian Studios");
    coleccion.add("Steam");

    System.out.println("\nAnadiendo elementos:");
    System.out.println(coleccion);

    coleccion.remove("Steam");

    System.out.println("\nEliminando elementos:");
    System.out.println(coleccion);

    coleccion.clear();

    System.out.println("\nEliminando todos los elementos:");
    System.out.println(coleccion);

  }

  public static void ejemplo02() {

    Collection<String> animales = Arrays.asList("Vaca", "Perro", "Gallina");
    Collection<String> mamiferos = List.of("Vaca", "Perro");
    Collection<String> aves = List.of("Gallina", "Pato");
    Collection<String> reptiles = List.of("Iguana");

    System.out.println("\nAnimales = " + animales);
    System.out.println("Mamiferos = " + mamiferos);
    System.out.println("Aves = " + aves);
    System.out.println("Reptiles = " + reptiles);

    System.out
        .println("\nAnimales contiene todos los mamiferos: " + animales.containsAll(mamiferos));
    System.out.println("Animales contiene todas las aves: " + animales.containsAll(aves));

    animales.addAll(reptiles);

    System.out.println("\nAnadiendo los elementos de la coleccion reptiles");
    System.out.println("Animales = " + animales);

    animales.retainAll(mamiferos);

    System.out.println("\nEliminando todos los animales salvo los mamiferos");
    System.out.println("Animales = " + animales);

    animales.addAll(aves);
    animales.removeAll(mamiferos);

    System.out.println("\nEliminando mamiferos");
    System.out.println("Animales = " + animales);

    animales.clear();

    System.out.println("\nEliminando todos los elementos");
    System.out.println("Animales = " + animales);

  }

  public static void ejemplo03() {
    Collection<String> continentes = Arrays.asList("Antartida", "Asia", "Oceania");
    Collection<Integer> listaVacia = new ArrayList<>();

    System.out.println(
        String.format("La lista continentes tiene tamaño %d: %s", continentes.size(), continentes));
    System.out.println(String.format("La lista listaVacia tiene tamaño %d y es vacia: %s",
        listaVacia.size(), listaVacia.isEmpty()));

  }

  public static void ejemplo04() {

    Collection<String> cosas = List.of("Piedra", "Tenedor", "Guitarra", "Bujía");
    var arrayCosas = cosas.toArray();

    System.out.println("Imprimiendo un Array de Strings generado a partir de una coleccion:");
    System.out.print("[");
    for (var n : arrayCosas) {
      System.out.print(n + ", ");
    }
    System.out.println("]");

    var arrayVacio = cosas.toArray(new String[] {});

    System.out.println("");
    System.out.println("Imprimiendo un Array de Strings generado a partir de una coleccion:");
    System.out.print("[");
    for (var n : arrayVacio) {
      System.out.print(n + ", ");
    }
    System.out.println("]");

    var arrayParcial = cosas.toArray(new String[6]);

    System.out.println("");
    System.out
        .println("Imprimiendo un Array parcial de Strings generado a partir de una coleccion:");
    System.out.print("[");
    for (var n : arrayParcial) {
      System.out.print(n + ", ");
    }
    System.out.println("]");

  }

  public static void ejemplo05() {
    Predicate<String> isNull = Objects::isNull;
    Predicate<String> isEmpty = String::isEmpty;
    Predicate<String> isNullOrEmpty = isNull.or(isEmpty);

    Collection<String> strings = new ArrayList<>();
    strings.add(null);
    strings.add("");
    strings.add("one");
    strings.add("two");
    strings.add("");
    strings.add("three");
    strings.add(null);

    System.out.println("strings = " + strings);
    strings.removeIf(isNullOrEmpty);
    System.out.println("filtered strings = " + strings);
  }

  public static void ejemplo06() {

    Collection<String> cosas = Arrays.asList("taza", "auriculares", "teclado", "silla");

    System.out.println("\nIterando sobre elementos de una coleccion");
    for (String elemento : cosas) {
      System.out.println(elemento);
    }
  }

}
