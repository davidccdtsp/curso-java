package tema10.interfaces;

public interface B extends A {

  default void foo(){     // Metodo redefinido-sobreescrito
    System.out.println("Metodo deafult en B que redefine foo en A");
  }
  
}
