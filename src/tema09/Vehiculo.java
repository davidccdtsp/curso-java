package tema09;

import java.util.Objects;

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

  public String toString() {

    String resultado = String.format("Vehiculo \nVelocidad: %d km/h - Peso: %d kg", velocidad, peso);
    return resultado;
  }

  public boolean equals(Object obj){

    boolean resultado = false;

    if(obj instanceof Vehiculo){
      Vehiculo vehiculo = (Vehiculo)obj;
      resultado = (vehiculo.peso == this.peso && vehiculo.velocidad == this.velocidad);
      resultado = (
        vehiculo.peso == this.peso 
        && vehiculo.velocidad == this.velocidad 
        && vehiculo.hashCode() == this.hashCode()
        );
    }

    return resultado;
  }

  public int hashCode(){
    return Objects.hash(peso,velocidad);
  }
  
}
