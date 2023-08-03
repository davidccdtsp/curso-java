package tema08;

public class Coche {

  private int peso;
  private int potencia;
  private int carga;

  public Coche(int peso, int potencia) {
    this.peso = peso;
    this.potencia = potencia;
  }

  public Coche(int peso, float batalla) {
    this.peso = peso;
    this.potencia = 100;
  }

  public void entrar(Pasajero... pasajeros) {
    for (int i = 0; i < pasajeros.length; i++) {
      carga = +pasajeros[i].getPeso();
    }
  }

}
