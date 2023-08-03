package tema08;

class Gato {

  // Propiedades
  String color = "Blanco";
  int peso = 3000;
  int talla = 54;
  boolean dormido = false;
  boolean hambriento = false;

  // Metodos
  public void duerme() {
    this.dormido = true;
  }

  public void despierta() {
    this.dormido = false;
  }

  public void come(int cantidad) {
    this.peso = peso + cantidad;
  }

  public void printEstado() {
    String estado = " color: " + this.color + "\n peso: " + this.peso + "gr\n talla: " + this.talla
        + "cm\n dormido: " + this.dormido + "\n hambriento: " + this.hambriento;
    System.out.println(estado);
  }
}


