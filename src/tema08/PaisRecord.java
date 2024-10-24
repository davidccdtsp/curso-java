package tema08;

public record PaisRecord(String capital, int poblacion) {

//  String nombre = "India";    // Error, no se puede definir atributos

 // Constructor canonico
//  public PaisRecord(String capital, int poblacion){
//    this.capital = capital;
//    this.poblacion = poblacion;
//    System.out.println("Constructor sobreescrito");
// //    this.capital = new String("Algo");  // Error, no se puede modificar un componente
//  }

 // Constructor en forma compacta
 // public PaisRecord{
 //   if(poblacion>1000)
 //     capital = capital.toUpperCase();
 // }

 public String capital(){
   return capital.toUpperCase();
 }

}
