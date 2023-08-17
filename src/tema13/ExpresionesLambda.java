package tema13;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class ExpresionesLambda {

  public static void ejemplo01(){

    Runnable runnable = () -> System.out.println("Ejecutando lambda sobre Runnable.run()");
    Consumer<String> consumer = (s) -> System.out.println("Ejecutando lambad sobre Consumer.accept(T) = "+s);
    Predicate<Integer> predicate = (Integer i) -> {return i>100;};

    runnable.run();

  }


}
