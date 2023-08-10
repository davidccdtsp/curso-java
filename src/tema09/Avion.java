package tema09;

public class Avion extends Vehiculo {

  private int altura;

  public Avion(int velocidad, int altura, int peso){
    super(velocidad, peso);
    this.altura = altura;
  }

  public void ascender(int incremento){
    altura += incremento;
  }

  public void descender(int decremento){
    altura = altura > decremento ? altura-decremento : 0;
  }

  public int getAltura(){
    return altura;
  }

  public void descripcion(){
    System.out.println("Esto es un avion a "+velocidad+" km/h y a "+altura+" pies de altura");
  }
  
}
