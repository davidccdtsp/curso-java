package tema08;

public class Planeta {
  private String nombre;
  int diametro;

  public Planeta(String nombre){
    this.nombre = nombre;
  }

  public void setNombre(String nuevoNombre){
    nombre = nuevoNombre;
  }

  public String getNombre(){
    return nombre;
  }

  public String toString(){
    return nombre;
  }
}
