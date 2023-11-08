package tema13;

public class Wildcard {

	 // Metodo con comodin acotado
    static void metodo1(CajaGenerica<? extends Number> caja) {
      System.out.println("Ejecutando metodo con metodo1(CajaGenerica<? extends Number> num)");
    };

    static void metodo2(CajaGenerica<Number> caja) {
      System.out.println("Ejecutando metodo metodo2(CajaGenerica<Number> num)");
    };

    // Metodo con comodin no acotado, emplea el metodo hashCode de Object
    static void metodo3(CajaGenerica<?> caja) {
      System.out.println("Imprimiendo hashCode: " + caja.hashCode());
    }

    // Metodo con comodin no acotado
    static void metodo4(CajaGenerica<?> caja) {
      System.out.println(caja.describir());
    }

    // Metodo con comodin acotado inferiormente
    static void metodo5(CajaGenerica<? super Number> caja) {
      System.out.println("Ejecutando metodo metodo5(CajaGenerica<?> caja)");
    };
}
