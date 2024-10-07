package tema02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
    // int variableInt2 = 214748364L;
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
    // String de digitos esperado
    // int i = Integer.parseInt("123_456");    // Lanza NumberFormatException

    System.out.println("1234_5678_9012_3456L = " + numTarjeta);
    System.out.println("999_999_999L = " + dni);
    System.out.println("3.14_15F = " + pi);
    System.out.println("0xFF_EC_DE_5E = " + hexBytes);
    System.out.println("0xCAFE_0123 = " + hexWords);
    System.out.println("0x7fff_ffff_ffff_ffffL = " + maxLong);
    System.out.println("0b0010_0101 = " + nybbles);
    System.out.println("0b11010010_01101001_10010100_10010010 = " + bLong);

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

  public static void ejemplo06() {

    boolean verdadero = true;
    boolean falso = false;

    System.out.println("Verdadero = " + verdadero);
    System.out.println("Falso = " + falso);
  }

  public static void ejemplo07() {

    // String a partir de un literal
    String literal = "Soy un String creado a partir de un literal";
    // String a partir de un array de char
    char[] arrayChar = {'h', 'o', 'l', 'a'};
    String stringDeArray = new String(arrayChar);
    // String con constructor pasando un literal
    String constructorConLiteral =
        new String("Soy un string creado con un constructor y un literal");

    System.out.println(literal);
    System.out.println(stringDeArray);
    System.out.println(constructorConLiteral);

  }

  public static void ejemplo08() {

    // Longitud de un string
    String cadena = "E = mc2";
    int longitudCadena = cadena.length();

    // Concatenacion de strings
    String concatenada = cadena.concat(" es la ecuación de equivalencia masa-energía");
    String otraFormaDeConcatenar =
        "(Otra forma de concatenar)" + cadena + " es la ecuación de equivalencia masa-energía";
    String aPartirDeLineas =
        "Esto es un string" + " creado a partir de varios literales" + "en diferentes lineas";
// A partir de Java 15
//    String html = """
//        <html>
//            <body>
//                <p>Hello, world</p>
//            </body>
//        </html>
//        """;

    System.out.println("La longitud de \"" + cadena + "\" es " + longitudCadena);
    System.out.println(concatenada);
    System.out.println(otraFormaDeConcatenar);
    System.out.println(aPartirDeLineas);
//    System.out.println(html);

    final String pi = "Pi";
    final float PI = 3.1415f;
    final int DIAMETRO_TIERRA = 12742;
    final double C = 2.998e8d;
    String fs;

    fs = String.format("El numero %s es %f, " + "el diametro terrestre es de %dkm "
        + "la velocidad de la luz es %.2f ",pi, PI, DIAMETRO_TIERRA, C);

    System.out.printf("El numero %s es %f, " + "el diametro terrestre es de %dkm "
        + "la velocidad de la luz es %.2f \n", pi, PI, DIAMETRO_TIERRA, C);

    System.out.println(fs);


    // Conversion de string a numero
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


    // Conversion de numero a string
    int i = 10;
    String s1 = "" + i;
    String s2 = String.valueOf(23.44f);
    String s3 = Integer.toString(i);
    String s4 = Float.toString(23.44f);

    System.out.println("String s1 = " + s1);
    System.out.println("String s2 = " + s2);
    System.out.println("String s3 = " + s3);
    System.out.println("String s4 = " + s4);

    // Obtencion de caracteres
    String rovers = "Opportunity & Curiosity";
    char primerCaracter = rovers.charAt(0);
    char ultimoCaracter = rovers.charAt(rovers.length() - 1);
    // Fuera de rango
    // char fueraDeRango = rovers.charAt(100);

    System.out.println(rovers);
    System.out.printf("El primer y último caracter son %c y %c \n", primerCaracter, ultimoCaracter);

    // Creacion de subcadenas
    String rover1 = rovers.substring(0, 11);
    String rover2 = rovers.substring(14);

    System.out
        .println("Dos célebres rovers de la exploración marciana son " + rover1 + " y " + rover2);

    String planetas = "Mercurio Venus Tierra Marte Júpiter Saturno Urano Neptuno";
    String arrayPlanetas[] = planetas.split(" ");
    String array3[] = planetas.split(" ", 3);

    System.out.println(Arrays.toString(arrayPlanetas));
    System.out.println(Arrays.toString(array3));

    String textoSinProcesar = "        consectetur adipiscing elit, sed do eiusmod      ";
    String textoProcesado = textoSinProcesar.trim();

    System.out.println(textoProcesado);

    String camelCase = "SuPer NOva";
    String minusculas = camelCase.toLowerCase();
    String mayusculas = camelCase.toUpperCase();

    System.out.println(minusculas);
    System.out.println(mayusculas);

    // Operaciones de busqueda sobre Strings
    String galaxia = "Vía lactea";
    int primerIndice = galaxia.indexOf("a");
    int ultimoIndice = galaxia.lastIndexOf("a");
    int primerIndicePartir = galaxia.indexOf("a", 4);
    int ultimoIndicePartir = galaxia.lastIndexOf("a", 6);
    int noExiste = galaxia.indexOf("w");
    boolean contieneA = galaxia.contains("Vía");

    System.out.println(galaxia);
    System.out.println("Primer indice para \"a\" : " + primerIndice);
    System.out.println("Últmo indice para  \"a\" : " + ultimoIndice);
    System.out.println("Primer indice para  \"a\" desde posición 4 : " + primerIndicePartir);
    System.out.println("Último indice pra  \"a\" hasta posición 6 : " + ultimoIndicePartir);
    System.out.println("No existe para \"w\" : " + noExiste);
    System.out.println(galaxia + " contiene Vía = " + contieneA);

    // Comparacion de Strings
    String comparame = "Horizonte de sucesos";

    boolean comienzaCon = comparame.startsWith("Horizonte");
    boolean finalizaCon = comparame.endsWith("sucesos");
    int comparacionMayor = comparame.compareTo("Radiación cósmica");
    int comparacionVerdadera = comparame.compareTo(new String("Horizonte de sucesos"));
    int comparacionMenor = comparame.compareTo("Entropía");
    int comparacionIgnorandoMayusculas = comparame.compareToIgnoreCase("horizonte de sucesos");
    boolean resultadoComparacion1 = comparame.equals(new String(""));
    boolean resultadoComparacion2 = comparame.equals("Horizonte de sucesos");
    boolean resultadoComparacion3 = comparame.equalsIgnoreCase("HorizonTE de sucesos");
    boolean concuerda = comparame.matches("(Hori)\\w.+");

    System.out.println("\n" + comparame);
    System.out.println("Comienza por Horizonte = " + comienzaCon);
    System.out.println("Finaliza con sucesos = " + finalizaCon);
    System.out.println("Compara con Horizonte de sucesos = " + comparacionVerdadera);
    System.out.println("Compara con Radiación cósmica = " + comparacionMayor);
    System.out.println("Compara con Entrop\u00EDa = " + comparacionMenor);
    System.out.println(
        "Compara ignorando mayúsculas con horzonte de sucesos = " + comparacionIgnorandoMayusculas);
    System.out.println("Equals \"\"?: " + resultadoComparacion1);
    System.out.println("Equals \"Horizonte de sucesos\"?: " + resultadoComparacion2);
    System.out.println("EqualsIgnoreCase \"HorizonTE de sucesos\"?: " + resultadoComparacion3);
    System.out.println("Concuerda con la expresion regular (Hori)\\w.+: " + concuerda);

  }

  public static void ejemplo09() {

    // Clase StringBuilder
    StringBuilder sb = new StringBuilder();
    sb.append("Saludos!");

    System.out.println("\nCreado un nuevo StringBuilder sb");
    System.out.println("sb.capacity() = " + sb.capacity());
    System.out.println("Añadido \"Saludos\"");
    System.out.println("sb.length() = " + sb.length());
    System.out.println("sb.capacity() = " + sb.capacity());

    // Constructores de StringBuilder
    CharSequence secuenciaCaracteres = "Hola";
    StringBuilder sb1 = new StringBuilder();
    StringBuilder sb2 = new StringBuilder(secuenciaCaracteres);
    StringBuilder sb3 = new StringBuilder(50);
    StringBuilder sb4 = new StringBuilder("Soy un StringBuilder");

    System.out.println("\nStringBuilder1 = \"" + sb1.toString() + "\" length = " + sb1.length()
        + ", capacity() = " + sb1.capacity());
    System.out.println("StringBuilder2 = \"" + sb2.toString() + "\" length = " + sb2.length()
        + ", capacity() = " + sb2.capacity());
    System.out.println("StringBuilder3 = \"" + sb3.toString() + "\" length = " + sb3.length()
        + ", capacity() = " + sb3.capacity());
    System.out.println("StringBuilder4 = \"" + sb4.toString() + "\" length = " + sb4.length()
        + ", capacity() = " + sb4.capacity());

    StringBuilder sb5 = new StringBuilder("Adios");

    System.out.println("\nNuevo StringBuilder : " + sb5);

    sb5.insert(0, "Hola");
    System.out.println("insert(0,\"Hola\") : " + sb5);
    sb5.insert(4, " - ");
    System.out.println("insert(4,\"-\") : " + sb5);
    sb5.insert(0, 1);
    System.out.println("insert(0,1) : " + sb5);

    sb5.append(" - ");
    System.out.println("append(\"-\") : " + sb5);
    sb5.append("Bienvenido");
    System.out.println("append(\"Bienvenido\") : " + sb5);

    sb5.deleteCharAt(0);
    System.out.println("deleteCharAt(0) : " + sb5);
    sb5.delete(5, 13);
    System.out.println("delete(5,13) : " + sb5);
    sb5.setCharAt(0, 'h');
    System.out.println("setCharAt(0,'h') : " + sb5);
    sb5.replace(5, 6, "*");
    System.out.println("replace(5,6,\"*\") : " + sb5);
    sb5.replace(4, 6, ",");
    System.out.println("replace(4,6,\",\") : " + sb5);
    sb5.replace(7, 50, "*******************");
    System.out.println("replace(7,50,\"*******************\") : " + sb5);
    sb5.replace(7, 50, "*");
    System.out.println("replace(7,8,\",\") : " + sb5);

  }

  public static void ejemplo10() {

    // Wrapper class
    Character ch = 'a';
    // Tipo primitivo
    char c = ch;

    System.out.println("Character ch = " + ch);
    System.out.println("char c = " + c);

    // Autoboxing (de int a Integer)
    List<Integer> ints = new ArrayList<>();
    for (int i = 1; i < 50; i += 2)
      ints.add(i);

    System.out.println("List<Integer> ints = "+ints);
    // Esto daria un error
    // List<integer> intsB = new Arraylist<>();

    // Unboxing
    int sum = 0;
    for(Integer i: ints){
      sum+=i.intValue();
    }
    System.out.println("int sum = "+sum);
  }

//  Java SE 10
 public static void ejemplo11(){
   // Var
   class Demo{
     // var propiedad = 12;   // Error, no puede ser una propiedad
   }

   var x = 100;    // int
   var y = 1.90;   // double
   var z = 'a';    // char
   var p = "tanu"; // string
   var q = false;  // boolean

   System.out.println();
   System.out.println("Ejemplo de uso de var");

   System.out.println(x);
   System.out.println(y);
   System.out.println(z);
   System.out.println(p);
   System.out.println(q);

 }


}
