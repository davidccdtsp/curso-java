package tema09b;

import tema09.SuperClase;

public class SubClase2 extends SuperClase{

  void metodoPropio(){
    // atr3++;       // Error, atr3 no es heredado
  }

  // Sobreescritura de metodo
  void foo(){
    System.out.println("SubClase1 hereda de SuperClase");
    System.out.println("float atr1 = "+atr1);  
    
  }
  
}
