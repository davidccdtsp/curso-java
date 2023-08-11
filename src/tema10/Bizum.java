package tema10;

import java.util.HashMap;
import java.util.Map;
import tema10.interfaces.InterfaceCartera;

public class Bizum implements InterfaceCartera {

  private Map<String,Float> cuentas = new HashMap<String,Float>();

  public Bizum(){
    cuentas.put("uno", 0.00f);
  }

  public float consultarFondos(String cuenta) {
    return cuentas.get(cuenta);
  }

  public float ingresarFondos(float cantidad, String cuenta) {
    if(cuentas.containsKey(cuenta) && cantidad > 0) {
      float nuevoSaldo = cuentas.get(cuenta) + cantidad;
      cuentas.put(cuenta, nuevoSaldo);
    }
      
    return cuentas.get(cuenta);
  }

  public float enviarFondos(float cantidad, String origen, String destino) {
    if(cuentas.containsKey(origen)) {   
      if(cuentas.get(origen) > cantidad){
        float nuevoSaldo = cuentas.get(origen) - cantidad;
        cuentas.put(origen,nuevoSaldo);
      }
    } 
    return cuentas.get(origen);
  }
  
}
