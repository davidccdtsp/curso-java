package tema08;

public class Coche {

  static final int NUMERO_RUEDAS = 4; // Constante
  public static int fabricados;       // Variable estatica

  private int peso;
  private int potencia;
  private float batalla;
  private int unidad;

  public Coche(int peso, int potencia, float batalla) {
    this.peso = peso;
    this.potencia = potencia;
    this.batalla = batalla;
    this.unidad = ++fabricados;
    // this.unidad = ++Coche.fabricados;
  }

  public Coche(int peso, int potencia) {
    this(peso, potencia, 1700);
  }

  public Coche(int peso, float batalla) {
    this(peso, 100, batalla);
  }

  public Coche(){
    this(1600, 100, 1700);
  }

//  public void entrar(Pasajero[] pasajeros) {
  public void entrar(Pasajero... pasajeros) {
    for (int i = 0; i < pasajeros.length; i++) {
      peso += pasajeros[i].getPeso();
    }
  }

  public String toString() {
    return "Coche "+unidad+"/"+fabricados+" con "+peso+"kg, "+potencia+"cv y "+batalla+"cm";
  }

}
