package tema09;

public class Vehiculo {
  // Atributos
  int velocidad;
  int peso;

  // Constuctor de la clase
  public Vehiculo(int velocidad, int peso){
    this.velocidad = velocidad;
    this.peso = peso;
  }

  // Metodos
  public void frenar(int decremento){
    velocidad -= decremento;
  }

  public void acelerar(int incremento){
    velocidad += incremento;
  }

  public void descripcion(){
    System.out.println("Esto es un vehiculo a "+velocidad+" km/h con un peso de "+peso+" kg");
  }
  
}
