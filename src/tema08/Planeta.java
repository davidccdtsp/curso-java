package tema08;

public class Planeta {
  private String nombre;
  int diametro;

  public Planeta(String nombre){
    this.nombre = nombre;
  }
  
  public Planeta(Planeta planeta) {
	  this.nombre = planeta.nombre;
	  this.diametro = planeta.diametro;
  }
  
  public static Planeta copy(Planeta planeta) {
	  return new Planeta(planeta);
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
