package proyecto2;

public class EjemploMain {

	public static void main(String[] args) {
		Empleado empleado1 = new Empleado("Ana", "Arcucci", "45685469", "rojas 1760" , 15000, 1);
			System.out.println(empleado1.toString());
	
		empleado1.aumentarRemuneracion(20);
		
		System.out.println(empleado1.toString());
		Cliente cliente1 = new Cliente ("Cele", "Melez", "123456789"," rojas 1920", 7);
		System.out.println(cliente1.toString());
		
		Gerente gerente1 =new Gerente("Lauti", "roas", "6985600", "rojas19191", 56, 5, 8.0);
		System.out.println(gerente1.toString());
		
		
		
		

	}

}
