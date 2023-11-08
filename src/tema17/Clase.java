package tema17;

import java.util.Arrays;
import java.util.List;

public class Clase {


  /**
   * @deprecated Metodo obsoleto, usar metodo2
   */
  @Deprecated
  void metodo1() {
    System.out.println("Metodo 1");
  }

  @SuppressWarnings("unused")
  void metodoConWarnings() {
    int valor;
    System.out.println("Llamando a metodo con warnings");
  }

  @SuppressWarnings({ "deprecation", "unused" })
  void metodoConMasWarnings() {

    int unusedVariable;
    this.metodo1();
  }

  @SafeVarargs
  static <T> List<T> crearLista(T... elementos) {
	return Arrays.asList(elementos);
  }

}
