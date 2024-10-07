package tema15;

public class Excepciones {

  public static void ejemplo01() {

    System.out.println();
    System.out.println("Probando excepciones, divison por 0");

    int val1, val2;
    try {
      System.out.println("Try Block:: Inicio");
      val1 = 0;
      val2 = 25 / val1;
      System.out.println(val2);
      System.out.println("Try Block:: Fin");
    } catch (ArithmeticException e) {
      System.out.println("ArithmeticException : Divide por cero "+e);
    } finally {
      System.out.println("Finally: ");
    }

  }

  public static void ejemplo02() {

    System.out.println();
    System.out.println("Multiples manejadores");


    try {
      System.out.println("Try Block: Inicio");
      int myArray[] = new int[5];
      System.out.println("Array de 5 elementos: " + myArray[10]);
      myArray[5] = 10 / 0;
    }

    catch (ArithmeticException e) {
      System.out.println("Arithmetic Exception : Divide por 0");
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("ArrayIndexOutOfBounds : Acceso fuera de rango");
    } catch (Exception e) {
      System.out.println("Exception :: " + e.getMessage());
    }
    System.out.println("Codigo tras excepcion ");
  }

  public static void ejemplo03() {

    System.out.println();
    System.out.println("Utilizando excepciones propias");

    int val1, val2;
    try {
      System.out.println("Try Block 1: Inicio");
      val1 = 0;
      val2 = 25 / val1;
      System.out.println(val2);
      System.out.println("Try Block 1: Fin");
    } catch (ArithmeticException e) {
    	
      System.out.println("ArithmeticException :: Divide por cero");
      try {
        throw new MiExcepcion("Division por 0 ");
      } catch (MiExcepcion e1) {
        System.out.println("Try Block 2: Inicio");
        System.out.println("Mensaje generado por MiExcepcion "+e1);
        System.out.println("Try Block 2: Fin");
      }
      
    } finally {
      System.out.println("Finally 1 ");
    }

  }

}


