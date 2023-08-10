package tema09;

public class Coche extends Vehiculo {

  private int plazas;

  public Coche(int velocidad, int peso, int plazas) {
    super(velocidad, peso);
    this.plazas = plazas;
  }

  public int getPlazas(){
    return plazas;
  }

  public void setPlazas(int plazas){
    this.plazas = plazas;
  }

  public void descripcion(){
    System.out.println("Esto es un coche de "+plazas+" a "+velocidad+" km/h");
  }
  
}
