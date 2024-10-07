package tema13;

public class Demo {

    static <U> void foo(U u) {
        System.out.println("Ejecutando metodo <U>foo(U u) sobre el tipo " + u.getClass());
      };

      static <T> CajaGenerica<T> empaquetar(T t) {
        System.out.println("Ejecutando metodo empaquetar sobre el tipo " + t.getClass());
        return new CajaGenerica<T>();
      }

      static <T> void desempaquetar(CajaGenerica<T> caja) {
        System.out.println("Desempaquetando caja del tipo " + caja.getClass().getName());
      }
      
     <T> void prueba(T parametro){
    	 System.out.println("Metodo de prueba -> "+parametro);
      }
     
     static <T> T unbox(CajaGenerica<T> caja) {
         System.out.println("Unbox de caja del tipo " + caja.getClass().getName());
    	 return caja.get();
//    	 return caja;
       }
}
