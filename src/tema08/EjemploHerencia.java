package tema08;

import controlAcceso.Sample;

public class EjemploHerencia extends Sample{

    public void helper() {  
        System.out.println(Sample.title); // Variable estatica
        System.out.println(super.year);  // Variable miembro
        super.printYear();               // Metodo
      }

}
