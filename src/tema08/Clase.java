package tema08;

class Clase {
  // Cuerpo de la clase

  // Declaracion de member variable
  public int edad;

  public int valorPublico;
  private int valorPrivado;

  public Clase() { // Metodo constructor

  }

  public void setValorPrivado(int valor) {
    valorPrivado = valor;
  }

  public void imprimirValor() {
    System.out.println("valorPublico = " + valorPublico);
    System.out.println("valorPrivado = " + valorPrivado);
  }

  public int foo(int valor) {
    int resultado = valor * 3;
    return resultado;
  }

  public double calcular(double x, double y, double z) {
    // Reealiza los calculos
    return 0;
  }

  public double calcular(int x, int y, int z) {
    // Reealiza los calculos
    return 0;
  }

  public int calcular(int x, int y) {
    return 0;
  }

  public void metodo(int valor, String palabra, String... palabras) {
    System.out.println("valor = " + valor);
    System.out.println("palabra = " + palabra);
    System.out.print("palabras = [");
    for (String pal : palabras)
      System.out.print(pal + ", ");
    System.out.println("]");
  }

  // Metodo de prueba para paso por valor y referencia
  public void modificaParametros(int masa, Planeta planeta) {
    masa = 22;
    planeta.setNombre("Marte");

    System.out.println("Valores dentro del metodo");
    System.out.println("planeta = " + planeta.getNombre());
    System.out.println("masa = " + masa);
  }


}
