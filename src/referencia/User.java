package referencia;

public class User {
	
	private String nombre;
	
	public User(String nombre) {
		this.nombre = nombre;
	}
	
	public static void referenciaAMetodoEstatico() {
		System.out.println("Probando referencia a método estático");
	}
	
	public void referenciaAMetodoParticular() {
		System.out.println("Probando referencia a método de objeto particular");
	}
	
	public void mostrarNombre() {
		System.out.println(this.nombre);
	}

}
