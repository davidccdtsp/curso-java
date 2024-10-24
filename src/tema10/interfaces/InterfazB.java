package tema10.interfaces;

public interface InterfazB extends InterfazSealed{
	
	default void defaultB() {
		System.out.println("Metodo default de la interfaz InterfazB");
	}

}
