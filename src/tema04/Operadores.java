package tema04;

public class Operadores {

  public static void main(String args[]) {


  }

  public static void asignacion() {

    // Operador de asignacion
    int edad = 12;
    char letra = 'X';
    String ciudad = "Manila";

  }

  public static void aritmeticos() {
    // Suma
    int resultado = 1 + 2;
    System.out.println("1 + 2 = " + resultado);
    int resultado_original = resultado;

    // Resta
    resultado = resultado - 1;
    System.out.println(resultado_original + " - 1 = " + resultado);
    resultado_original = resultado;

    // Multiplicaci'on
    resultado = resultado * 2;
    System.out.println(resultado_original + " * 2 = " + resultado);
    resultado_original = resultado;

    // Division
    resultado = resultado / 2;
    System.out.println(resultado_original + " / 2 = " + resultado);
    resultado_original = resultado;

    resultado = resultado + 8;
    System.out.println(resultado_original + " + 8 = " + resultado);
    resultado_original = resultado;

    // Resto
    resultado = resultado % 7;
    System.out.println(resultado_original + " % 7 = " + resultado);

  }

  public static void unarios() {

    int resultado = +1;
    // resultado += 2;
    // resultado es 1
    System.out.println(resultado);

    resultado--;
    // resultado es 0
    System.out.println(resultado);

    resultado++;
    // resultado es 1
    System.out.println(resultado);

    resultado = -resultado;
    // resultado es 1
    System.out.println(resultado);

    boolean falso = !false;
    // false
    System.out.println(falso);
    // true
    System.out.println(!falso);

    // Ejemplo de evaluacion de los operadores incremento/decremento
    int valor = 21;
    System.out.println(++valor); // 22
    System.out.println(valor++); // 22
    System.out.println(valor); // 23

    float x = 128f;
    var c = (double) -x;
    System.out.println("float x = " + x);
    System.out.println("var c = (double)+x es " + c);
    System.out.println("La clase de c es " + ((Object) c).getClass());
    double d = (x) + c;
    System.out.println("var d = (x)+c es " + d);

    // Complemento
    int z = 4;
    int compZ = ~z; // 100 -> 011
    System.out.println("x = 4, -> ~x =" + compZ);
    System.out.println(Integer.toBinaryString(compZ));
    System.out.println(Integer.toBinaryString(~compZ));
    System.out.println(Integer.toBinaryString(z));

  }

  public static void igualdad() {

    int x = 13;
    int y = 22;

    boolean resultado = x == y;
    System.out.println("13 == 22 es " + resultado);

    resultado = x != y;
    System.out.println("13 != 22 es " + resultado);

    // resultado = true == y; // Error en tiempo de compilacion

    resultado = true == (12 == 21);
    // resultado = true == 12 == 21; // Error en tiempo de compilacion
    System.out.println("true == (12 == 21) es " + resultado);

  }

  public static void relacionales() {
    int x = 13;
    int y = 22;

    boolean resultado = x > y;
    System.out.println("x > y es " + resultado);
    resultado = x >= y;
    System.out.println("x >= y es " + resultado);
    resultado = x < y;
    System.out.println("x < y es " + resultado);
    resultado = x >= y;
    System.out.println("x <= y es " + resultado);

  }

  public static void condicionales() {

    boolean resultado = true && false;
    System.out.println("true && false es " + resultado);
    resultado = true && (5 > 3);
    System.out.println("true && (5 > 3) " + resultado);

    resultado = true || false;
    System.out.println("true || false es " + resultado);
    resultado = false || (5 < 3);
    System.out.println("false || (5 < 3) " + resultado);

    String comparacion = (7 > 8) ? "Mayor" : "Menor";
    System.out.println("(7 > 8) ? \"Mayor\" : \"Menor\"; devuelve " + comparacion);

    int x = 10;
    comparacion = (x % 2 == 0) ? (x > 0) ? "Par y mayor que 0" : "Par y menor que 0" : "Impar";
    System.out.println(
        "(x%2==0) ? (x>0) ? \"Par y mayor que 0\" : \"Par y menor que 0\"  : \"Impar\" es evaluado como: "
            + comparacion);

  }



  public static void instanciaDe() {


    class Poligono {
    };
    class Rectangulo extends Poligono {
    };
    class Hexagono extends Poligono {
    };

    Poligono poligono = new Poligono();
    Rectangulo rectangulo = new Rectangulo();
    Hexagono hexagono = new Hexagono();

    System.out.println("poligono instanceof Poligono: " + (poligono instanceof Poligono));
    System.out.println("poligono instanceof Rectangulo: " + (poligono instanceof Rectangulo));
    System.out.println("poligono instanceof Hexagono: " + (poligono instanceof Hexagono));
    System.out.println("rectangulo instanceof Rectangulo: " + (rectangulo instanceof Rectangulo));
    System.out.println("rectangulo instanceof Poligono: " + (rectangulo instanceof Poligono));
    // System.out.println("rectangulo instanceof Hexagono: " + (rectangulo instanceof Hexagono));
    // System.out.println("hexagono instanceof Rectangulo: " + (hexagono instanceof Rectangulo));
    System.out.println("hexagono instanceof Poligono: " + (hexagono instanceof Poligono));
    System.out.println("hexagono instanceof Hexagono: " + (hexagono instanceof Hexagono));

  }

  public static void bitwise() {

    int valorA = 6; // En binario -> 110
    int valorB = 5; // En bianrio -> 101

    System.out.println("A = " + Integer.toBinaryString(valorA));
    System.out.println("B = " + Integer.toBinaryString(valorB));

    int resultado = valorA & valorB; // 100
    System.out.println("A & B = " + Integer.toBinaryString(resultado));
    resultado = valorA ^ valorB; // 011
    System.out.println("A ^ B = " + Integer.toBinaryString(resultado));
    resultado = valorA | valorB; // 111
    System.out.println("A | B = " + Integer.toBinaryString(resultado));

    // Ejemplo precedencia
    int valorC = 7; // En biario -> 111
    resultado = valorB & valorA ^ valorC; // (101 & 110) ^ 111 = 011;
    System.out.println(" B & A ^ C = " + Integer.toBinaryString(resultado));
    resultado = valorB & (valorA ^ valorC); // 101 & (110 ^ 111) = 001;
    System.out.println("B & (A ^ C) = " + Integer.toBinaryString(resultado));

  }

  public static void bitShift() {

    int valorA = 21; // En binario -> 101010

    System.out.println("A = " + Integer.toBinaryString(valorA));
    int resultado = valorA >> 2;
    System.out.println(" A >> 2 = " + Integer.toBinaryString(resultado));
    resultado = valorA << 2;
    System.out.println(" A << 2 = " + Integer.toBinaryString(resultado));
    resultado = valorA >>> 2;
    System.out.println(" A >>> 2 = " + Integer.toBinaryString(resultado));

    valorA = -21; // 11111111111111111111111111101011

    System.out.println("A = " + Integer.toBinaryString(valorA));
    resultado = valorA >> 2;
    System.out.println(" A >> 2 = " + Integer.toBinaryString(resultado));
    resultado = valorA << 2;
    System.out.println(" A << 2 = " + Integer.toBinaryString(resultado));
    resultado = valorA >>> 2;
    System.out.println(" A >>> 2 = " + Integer.toBinaryString(resultado));



  }

}
