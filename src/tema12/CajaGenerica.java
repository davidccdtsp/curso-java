package tema12;

public class CajaGenerica<T> {

  private T objeto;

  public void set(T objeto) {
    this.objeto = objeto;
  };

  public T get(){
    return objeto;
  };

  public String describir(){
    String result = "Soy una caja ";

    if(objeto == null)
      result = result.concat("vacia");
    else  
      result = result.concat(objeto.getClass().getSimpleName());
    
    return result;
  };
  
}
