package tema10.interfaces;

public interface InterfazMovimiento {

  int VEL_MAXIMA = 10;
  
  boolean avanza(double distancia, int velocidad);
  boolean gira(int grados);

}
