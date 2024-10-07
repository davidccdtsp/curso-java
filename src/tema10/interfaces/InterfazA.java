package tema10.interfaces;

public interface InterfazA extends InterfazSealed{

  default void foo(){
    System.out.println("Metodo default en A");

  }

}
