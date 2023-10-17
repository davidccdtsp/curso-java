package tema17;

public class Secundaria extends Principal{

  @Override
  void foo(){
    System.out.println("Metodo foo() sobreescrito de la clase Principal");
  }

  @Override
  int suma(int x, int i) {
    return x + i * 2;
  }
  
}
