package tema08;

public class ClasesJava {

  public static void ejemplo01(){

    Clase objeto = new Clase();

    objeto.valorPublico = 22;
    // objeto.valorPrivado = 10;
    objeto.imprimirValor();

    objeto.setValorPrivado(15);
    objeto.imprimirValor();
  }
  
}
