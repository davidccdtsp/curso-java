package tema09;

import java.util.logging.Logger;

public class Persona implements Cloneable {

  private final static Logger LOGGER = Logger.getLogger(Persona.class.getName());

  private String nombre;
  private Persona hijo;

  public Persona(String nombre) {
    this(nombre, null);
  }

  public Persona(String nombre, Persona hijo) {
    this.nombre = nombre;
    this.hijo = hijo;
  }

  public String getNombre() {
    return nombre;
  };

  public Persona getHijo() {
    return hijo;
  };

  public void setNombre(String nombre) {
    if(nombre!=null || nombre!="")
      this.nombre = nombre;
  }

  public void setHijo(Persona hijo) {
    if(hijo!= null && !this.equals(hijo))
      this.hijo = hijo;
  }

  @Override
  public String toString() {
    String hijo = (this.hijo != null) ? this.hijo.getNombre() : "sin hijo";
    return String.format("Persona %s con hijo %s", nombre, hijo);
  };

  @Override
  protected Persona clone() {
    Persona clon = null;
    try {
      clon = (Persona) super.clone();
      // clon.nombre = nombre;
      clon.hijo = hijo;
      // if(hijo!=null)
      //   clon.hijo = hijo.clone();
    } catch (CloneNotSupportedException e) {
      LOGGER.warning(e.getMessage());
    }

    return clon;
  };

  @Override
  public void finalize() {
    System.out.println("La persona "+nombre+" va a ser eliminada");
  }

}
