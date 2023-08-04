package tema08;

public class Bicicleta {

  // Variable estatica
  private static int fabricadas = 1765;

  private String modelo;
  private int numSerie;

  public Bicicleta(String modelo){
    this.modelo= modelo;
    numSerie = unidadesFabricadas() + 1;
    // numSerie = Bicicleta.unidadesFabricadas() + 1;
    fabricadas++;
  }

  // Metodo estatico
  public static int unidadesFabricadas(){
    return fabricadas;
  }

  public String toString(){
    return modelo+" - numero de serie: "+numSerie;
  }
  
}
