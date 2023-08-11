package tema10.interfaces;

public interface InterfaceCartera {

  int NUM_CUENTAS = 3;    // Constante

  float consultarFondos(String cuenta);
  float ingresarFondos(float cantidad, String cuenta);
  float enviarFondos(float cantidad, String origen, String destino);  
  
}
