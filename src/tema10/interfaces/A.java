package tema10.interfaces;

public non-sealed interface A extends InterfazSealed{

  default void foo(){
    System.out.println("Metodo default en A");

  }

}
