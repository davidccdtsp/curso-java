package controlAcceso;

public class AnotherSample {

  Sample sample = new Sample();


  public void helper() {
    System.out.println(Sample.title); // Variable estatica
    System.out.println(sample.year);  // Variable miembro
    sample.printYear();               // Metodo
  }

}
