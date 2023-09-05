package anexo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

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

    Collection<String> animales = new ArrayList<>();
    animales.add("Vaca");
    animales.add("Perro");
    animales.add("Gallina");

    Collection<String> mamiferos = new ArrayList<>();
    mamiferos.add("Vaca");
    mamiferos.add("Perro");

    Collection<String> aves = new ArrayList<>();
    aves.add("Gallina");
    aves.add("Pato");

    Collection<String> reptiles = new ArrayList<>();
    reptiles.add("Iguana");

    System.out.println("\nAnimales = " + animales);
    System.out.println("Mamiferos = " + mamiferos);
    System.out.println("Aves = " + aves);
    System.out.println("Reptiles = " + reptiles);

    System.out.println("\nAnimales contiene todos los mamiferos: " + animales.containsAll(mamiferos));
    System.out.println("Animales contiene todas las aves: " + animales.containsAll(aves));

    animales.addAll(reptiles);

    System.out.println("\nAnadiendo los elementos de la coleccion reptiles");
    System.out.println("Animales = " + animales);

    animales.removeAll(mamiferos);

    System.out.println("\nEliminando mamiferos");
    System.out.println("Animales = " + animales);

  }
  
  public static void ejemplo03(){

    Collection<String> dias = new ArrayList<>();
    dias.add("lunes");
    dias.add("viernes");

    System.out.println("\nColeccion dias:");
    System.out.println(dias);


    System.out.println("\nTamano: "+dias.size());
    System.out.println("Vacia: "+dias.isEmpty());

    dias.clear();

    System.out.println("\nLimpiando coleccion:");
    System.out.println(dias);

    System.out.println("Vacia: "+dias.isEmpty());

  }

  public static void ejemplo04(){

    Collection<String> cosas = List.of("taza","auriculares", "teclado", "silla");


    System.out.println("\nIterando sobre elementos de una coleccion");
    for(String elemento: cosas){
      System.out.println(elemento);  
    }
  }
}
