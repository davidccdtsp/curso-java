package tema01;

public class TiposPrimitivos {

  static byte variableByte;
  static short variableShort;
  static int variableInt;
  static long variableLong;
  static float variableFloat;
  static double variableDouble;
  static char variableChar;
  static boolean variableBoolean;

  public static void ejemplo01() {

    System.out.println("Valor por defecto");
    System.out.println("variableByte = " + variableByte);
    variableByte = 12;
    System.out.println("Asignamos valor el valor 12");
    System.out.println("variableByte = " + variableByte + "\n");

    System.out.println("Valor por defecto");
    System.out.println("variableShort = " + variableShort);
    variableShort = -5000;
    System.out.println("Asignamos valor el valor -5000");
    System.out.println("variableShort = " + variableShort + "\n");

    System.out.println("Valor por defecto");
    System.out.println("variableInt = " + variableInt);
    variableInt = 34000;
    System.out.println("Asignamos valor el valor 34000");
    System.out.println("variableInt = " + variableInt + "\n");

    System.out.println("Valor por defecto");
    System.out.println("variableLong = " + variableLong);
    variableLong = 2147489;
    System.out.println("Asignamos valor el valor 2147489");
    System.out.println("variableLong = " + variableLong + "\n");

    System.out.println("Valor por defecto");
    System.out.println("variableFloat = " + variableFloat);
    variableFloat = 3.1415f;
    System.out.println("Asignamos valor el valor 3,1415");
    System.out.println("variableFloat = " + variableFloat + "\n");

    System.out.println("Valor por defecto");
    System.out.println("variableDouble = " + variableDouble);
    variableDouble = 3.141592653d;
    System.out.println("Asignamos valor el valor 3,141592653");
    System.out.println("variableDouble = " + variableDouble + "\n");

    System.out.println("Valor por defecto");
    System.out.println("variableChar = '" + variableChar + "'");
    variableChar = 'a';
    System.out.println("Asignamos valor el valor a");
    System.out.println("variableChar = " + variableChar);
    variableChar = 97;
    System.out.println("Asignamos valor el valor 97");
    System.out.println("variableChar = " + variableChar + "\n");

    System.out.println("Valor por defecto");
    System.out.println("variableBoolean = " + variableBoolean);
    variableBoolean = true;
    System.out.println("Asignamos valor el valor true");
    System.out.println("variableBoolean = " + variableBoolean);
  }

  public static void ejemplo02() {

    // Declaraciones correctas
    long variableLong = 2147483649L;
    int variableInt = 2147483647;

    // Declaraciones erroneas
    // int variableInt2 = 2147483649L;
    // long variableLong2 = 2147483649;

    System.out.println("variableLong = " + variableLong);
    System.out.println("variableInt = " + variableInt);

    System.out.println();

    // Diferentes representaciones de un int
    // El numero 26 en decimal
    int enteroDecimal = 26;
    int enteroHexadecimal = 0x1a;
    int enteroBinario = 0b11010;

    System.out.println("enteroDecimal = " + enteroDecimal);
    System.out.println("enteroHexadecimal = " + enteroHexadecimal);
    System.out.println("enteroBinario = " + enteroBinario);


  }

  public static void ejemplo03() {

    // Diferentes notaciones mismo resultado
    double d1 = 123.4;
    double d2 = 1.234e2;
    float f1 = 123.4f;

    System.out.println("d1 = " + d1);
    System.out.println("d2 = " + d2);
    System.out.println("f1 = " + f1);
  }

  public static void ejemplo04() {

    long numTarjeta = 1234_5678_9012_3456L;
    long dni = 999_999_999L;
    float pi = 3.14_15F;
    long hexBytes = 0xFF_EC_DE_5E;
    long hexWords = 0xCAFE_0123;
    long maxLong = 0x7fff_ffff_ffff_ffffL;
    byte nybbles = 0b0010_0101;
    long bLong = 0b11010010_01101001_10010100_10010010;

    System.out.println("1234_5678_9012_3456L = "+numTarjeta);
    System.out.println("999_999_999L = "+dni);
    System.out.println("3.14_15F = "+pi);
    System.out.println("0xFF_EC_DE_5E = "+hexBytes);
    System.out.println("0xCAFE_0123 = "+hexWords);
    System.out.println("0x7fff_ffff_ffff_ffffL = "+maxLong);
    System.out.println("0b0010_0101 = "+nybbles);
    System.out.println("0b11010010_01101001_10010100_10010010 = "+bLong);

  }

  public static void ejemplo05() {

    // Diferentes modos de expresar C
    char charCaracter = 'C';
    char charHex = '\u0043';
    char charDec = 67;

    System.out.println("'C' = " + charCaracter);
    System.out.println("'\u0043' = " + charHex);
    System.out.println(" 67 = " + charDec);

    int valorDec = charCaracter;
    String valorHex = Integer.toHexString(charCaracter);
    System.out.println("Valor decimal de C = " + valorDec);
    System.out.println("Valor hexadecimal de C = 00" + valorHex);
  }

  public static void ejemlo06() {

    boolean verdadero = true;
    boolean falso = false;

    System.out.println("Verdadero = "+verdadero);
    System.out.println("Falso = "+falso);
  }

  public static void ejemplo07() {

    // String a partir de un literal
    String literal = "Soy un String creado a partir de un literal";
    // String a partir de un array de char
    char[] arrayChar = {'h','o','l','a'};
    String stringDeArray = new String(arrayChar);
    // String con constructor pasando un literal
    String constructorConLiteral = new String("Soy un string creado con un constructor y un literal");
    
    System.out.println(literal);
    System.out.println(stringDeArray);
    System.out.println(constructorConLiteral);
    
  }

  public static void ejemplo08() {

    String cadena = "E = mc2";
    int longitudCadena = cadena.length();
    String concatenada = cadena.concat(" es la ecuación de equivalencia masa-energía");
    String otraFormaDeConcatenar = "(Otra forma de concatenar)" + cadena + " es la ecuación de equivalencia masa-energía";
    String aPartirDeLineas = 
      "Esto es un string" + 
      " creado a partir de varios literales" + 
      "en diferentes lineas";
    String html = """
              <html>
                  <body>
                      <p>Hello, world</p>
                  </body>
              </html>
              """;

    System.out.println("La longitud de \""+cadena+"\" es "+longitudCadena);
    System.out.println(concatenada);
    System.out.println(otraFormaDeConcatenar);
    System.out.println(aPartirDeLineas);
    System.out.println(html);

    final float PI = 3.1415f;
    final int DIAMETRO_TIERRA = 12742;
    final double C = 2.998e8d;
    String fs;

    fs = String.format("El numero Pi es %f, "+
                      "el diametro terrestre es de %dkm "+
                      "la velocidad de la luz es %.2f ",
                      PI, DIAMETRO_TIERRA, C);

    System.out.printf("El numero Pi es %f, "+
                      "el diametro terrestre es de %dkm "+
                      "la velocidad de la luz es %.2f \n",
                      PI, DIAMETRO_TIERRA, C);

    System.out.println(fs);


    // Convewrsion de string a numero
    String stringEntero = "128";
    String stringDecimal = "9.45";

    int enteroA = Integer.valueOf(stringEntero).intValue();
    int enteroB = Integer.parseInt("100");
    int suma = enteroA + enteroB;

    double decimalA = Double.valueOf(stringDecimal).floatValue();
    double decimalB = Double.parseDouble("1.5");
    double sumaDecimal = decimalA + decimalB;

    System.out.printf("La suma de %d + %d es %d\n", enteroA, enteroB, suma);
    System.out.printf("La suma de %.2f + %.2f es %.2f\n", decimalA, decimalB, sumaDecimal);


  }


}
