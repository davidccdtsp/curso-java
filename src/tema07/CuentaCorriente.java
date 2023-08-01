package tema07;

public class CuentaCorriente {

  private int lineaCredito = 0;
  private int saldo = 0;

  public CuentaCorriente() {
   
  }

  public CuentaCorriente(int saldoInicial) {
    if (saldoInicial >= 500000) {
      lineaCredito = 1000000;
      return;
    }

    if (saldoInicial >= 100000) {
      lineaCredito = 200000;
      return;
    }

    this.saldo = saldoInicial;
  }


  public int getSaldo() {
    return saldo;
  }

  public void ingresar(int cantidad) {

    if (cantidad >= 0) {
      saldo += cantidad;
      System.out.println("Ingresados = " + cantidad + "€");
    }
  }

  public void retirar(int cantidad) {

    if (saldo > cantidad && cantidad > 0) {
      saldo -= cantidad;
      System.out.println("Retirados = " + cantidad + "€");
    } else {
      System.out.println("Error: saldo insuficiente o cantidad < 0");
    }

  }


  public String calcularRiesgo(int prestamo) {

    int diferencial = prestamo - saldo;
    String riesgo;

    if (diferencial >= 1000000) {
      riesgo = "Alto";
    } else if (diferencial >= 500000) {
      riesgo = "Medio-Alto";
    } else if (diferencial >= 200000) {
      riesgo = "Medio";
    } else if (diferencial >= 100000) {
      riesgo = "Medio-bajo";
    } else
      riesgo = "Bajo";

    return riesgo;
  }

  public void mostrarEstado() {
    System.out.println("Saldo actual = " + saldo + "€");
  }

  public float[] simularIntereses(int plazo, float deposito, float interes) {
    float[] intereses = new float[plazo];
    int mes = 0;
    float acumulado = deposito;

    while (plazo > mes) {
      intereses[mes] = acumulado * interes;
      acumulado += intereses[mes];
      mes++;
    }

    return intereses;
  }

}
