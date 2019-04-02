package referencia;

import java.util.ArrayList;
import java.util.List;

public class ReferenciaMetodo {

	public static void main(String[] args) {
		
		/*
		 * Referencia a static method
		 * Class::staticMethod	Math::abs	n->Math.abs(n)
		 */
		// Forma tradicional
		Trabajo trabajo = new Trabajo() {
			
			@Override
			public void accion() {
				User.referenciaAMetodoEstatico();				
			}
		};
		
		// Forma Lambda
		Trabajo trabajoLambda = () -> User.referenciaAMetodoEstatico();

		// Forma Referencia a Método de Clase
		Trabajo trabajoRMC = User::referenciaAMetodoEstatico;
		trabajoRMC.accion();
		
		
		/*
		 * Referencia a un método de instancia de un objeto particular
		 * instancia::metodoInstancia	s::toString		() -> "string".toString
		 */
		// Forma Lambda
		User user = new User("Eimer");
		Trabajo trabajoLamba2 = () -> user.referenciaAMetodoParticular();
		
		// Forma Referencia a Método Particular
		Trabajo trabajoRMP = user::referenciaAMetodoParticular;
		trabajoRMP.accion();
		
		
		/*
		 * Referencia a un método de instanciade un
		 * objeto arbitrario de tipo particular
		 * Class::metodoInstancia	String::toString	s -> s.toString()
		 */
		// Forma Lambda
		TrabajoString trabajoString = (palabra) -> palabra.toUpperCase();
		
		// Forma Referencia Método de Instancia
		TrabajoString trabajoStringRMI = String::toUpperCase;
		System.out.println(trabajoStringRMI.accion("eimer"));
		
		// Usando Listas
		List<User> users = new ArrayList<>();
		users.add(new User("Eimer"));
		users.add(new User("Alejandra"));
		users.add(new User("Luisa"));
		users.add(new User("Manuel"));
		users.add(new User("Duvan"));
		
		// Forma Lambda
		users.forEach(usuario -> usuario.mostrarNombre());
		
		// Forma Referencia a Método de Instancia
		users.forEach(User::mostrarNombre);
		
		
		/*
		 * Referencia a un Constructor
		 * Class::new	String::new		() -> new String
		 */
		// Forma Tradicional
		IUser iUser = new IUser() {
			
			@Override
			public User crear(String nombre) {
				return new User(nombre);
			}
		};
		
		// Forma Lambda
		IUser iUserLambda = (nombre) -> new User(nombre);
		
		// Forma Referencia a Constructor
		IUser iUserRC = User::new;
	}

}
