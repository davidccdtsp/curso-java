package tema14;

public class Demo {

    static final Demo objetoDemo = new Demo("Objeto demo");
    String palabra;

    public Demo(String palabra) {
      this.palabra = palabra;
    }

    static void escribe(String valor) {
      System.out.println("Escribiendo " + valor.toUpperCase());
    }

    String getPalabra() {
      return palabra;
    }

    void print(String s) {
      System.out.println(s);
    }

  }
