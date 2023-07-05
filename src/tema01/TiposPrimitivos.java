package tema01;

public class TiposPrimitivos {

  static byte variableByte;
  static short variableShort;
  static int variableInt;
  static float variableFloat;
  static double variableDouble;
  static char variableChar;
  static boolean variableBoolean;

  public static void ejemplo01() {

    System.out.println("variableByte = " + variableByte);
    variableByte = 12;
    System.out.println("Asignamos valor el valor 12");
    System.out.println("variableByte = " + variableByte+"\n");

    System.out.println("variableShort = " + variableShort);
    variableShort = -5000;
    System.out.println("Asignamos valor el valor -5000");
    System.out.println("variableShort = " + variableShort+"\n");

    System.out.println("variableInt = " + variableInt);
    variableInt = 34000;
    System.out.println("Asignamos valor el valor 34000");
    System.out.println("variableInt = " + variableInt+"\n");

    System.out.println("variableFloat = " + variableFloat);
    variableFloat = 3.1415f;
    System.out.println("Asignamos valor el valor 3,1415");
    System.out.println("variableFloat = " + variableFloat+"\n");

    System.out.println("variableDouble = " + variableDouble);
    variableDouble = 3.141592653d;
    System.out.println("Asignamos valor el valor 3,141592653");
    System.out.println("variableDouble = " + variableDouble+"\n");

    System.out.println("variableChar = '" + variableChar+"'");
    variableChar = 'a';
    System.out.println("Asignamos valor el valor a");
    System.out.println("variableChar = " + variableChar);
    variableChar = 97;
    System.out.println("Asignamos valor el valor 97");
    System.out.println("variableChar = " + variableChar+"\n");

    System.out.println("variableBoolean = " + variableBoolean);
    variableBoolean = true;
    System.out.println("Asignamos valor el valor true");
    System.out.println("variableBoolean = " + variableBoolean);
  }

}
