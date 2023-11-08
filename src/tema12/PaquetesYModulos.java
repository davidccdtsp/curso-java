package tema12;

import java.io.FileReader;  // Importa el miembro
import java.math.*;         // Importa el paquete   
import tema08.Planeta;
// import tema12.dos.Planeta;  // Error colision
import tema12.uno.Persona;  // Importa de subpaquete
// import java.awt.*;
import java.awt.color.*;

import static java.lang.Math.PI;
import  java.lang.Math.*;

//import com.dataspartan.curso.java.Curso;  // Importa el modulo creado

public class PaquetesYModulos {

  public static void ejemplo01(){
    FileReader fr;

    java.util.Random random = new java.util.Random(0);  // Referenciado por el nombre cualificado completo

    ICC_Profile profile = ICC_Profile.getInstance(ColorSpace.CS_sRGB);  // necesita java.awt.color

  }

  public static void ejemplo02(){
    // Colision de nombres

    tema08.Planeta marte = new tema08.Planeta("Marte");
    tema12.dos.Planeta tierra = new tema12.dos.Planeta();
    Persona persona = new Persona();

  }

  public static void ejemplo03(){
    // Constantes

    double piA = PI;        // Importando static java.lang.Math.PI
    double piB = Math.PI;   // Impoortando java.lang.Math.*;
  }

//  public static void ejemplo04(){
//    // Importando modulo
//    Curso curso = new Curso();
//    curso.presentar();
//  }
  
}


