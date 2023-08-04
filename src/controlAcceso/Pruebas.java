package controlAcceso;

public class Pruebas {

  // Acceso a clase publica con miembros con acceso public
  Ejemplo ejemplo = new Ejemplo();

  // Acceso a todos los metodos y propiedades
  public void publico() {
    System.out.println(Ejemplo.title);
    System.out.println(ejemplo.year);
    ejemplo.printYear();
  }

  // Acceso a clase publica con miembros con acceso por defecto
  EjemploPorDefecto porDefecto = new EjemploPorDefecto();

  // Acceso a todos los metodos y propiedades permitidos
  public void porDefecto() {
    System.out.println(EjemploPorDefecto.title);
    System.out.println(porDefecto.year);
    porDefecto.printYear();
  }

  // Acceso a miembros privados desde fuera de la clase
  // pero en el mismo package
  EjemploPrivado privado = new EjemploPrivado();

  public void privado() {
    // El siguiente codigo producira un error
    // System.out.println(EjemploPrivado.title);
    // System.out.println(privado.year);
    // privado.printYear();
  }

}
