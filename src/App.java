import ejercicio1.Habitacion;
import ejercicio1.UnidadHospitalaria;
import ejercicio2.Alumno;
import ejercicio2.AlumnoGC;
import ejercicio3.Coordinador;
import ejercicio3.Queja;

public class App {

	public static void main(String[] args) {

		probarEjercicio1();
		probarEjercicio2();
		probarEjercicio3();

	}

	private static void probarEjercicio1() {

		Habitacion hab1 = new Habitacion(1, "Paco", "Perez", "111111", "8/2/20", true);
		Habitacion hab2 = new Habitacion(2, "Pepe", "Lopez", "222222", "8/2/20", false);
		Habitacion hab3 = new Habitacion(3, "Maria", "Gomez", "333333", "8/2/20", false);
		Habitacion hab4 = new Habitacion(4, "Ana", "Sanchez", "444444", "8/2/20", true);

		UnidadHospitalaria planta1 = new UnidadHospitalaria();
		planta1.añadirElemento(hab1);
		planta1.añadirElemento(hab2);
		planta1.añadirElemento(hab3);
		planta1.añadirElemento(hab4);

		System.out.println("Resultado del Ejercicio 1\nEl numero de infectados es de " + planta1.getNumeroInfectados());

	}

	private static void probarEjercicio2() {
		
		System.out.println("\nResultado del Ejercicio 2");
		
		Alumno alumnoGC = new AlumnoGC("Pepe", "capitan", 5, 3, new String[] {"vino", "jamon"} );
		System.out.println("La calificacion del GC es de:" + alumnoGC.calificacion());
		
		Alumno alumnoET = new AlumnoGC("Paco", "Teniente", 5, 1, new String[] {"queso", "Lomo" , "Chorizo"} );
		System.out.println("La calificacion del ET es de:" + alumnoET.calificacion());
		

	}

	private static void probarEjercicio3() {
		
		System.out.println("\nResultado del Ejercicio 3");
		Coordinador coordinador = Coordinador.getInstanciaUnica();

		ejercicio3.Alumno paco = new ejercicio3.Alumno("Paco");
		
		coordinador.apuntarse(paco);
		coordinador.quejarse(new Queja("me estoy quejando por primera vez", paco));
		
		coordinador.consultarAlumnos();
		coordinador.consultarQuejas();
		
		//Pruebo que sigue habiendo una sola instancia de coordinador
		
		Coordinador coordinador2 = Coordinador.getInstanciaUnica();

		ejercicio3.Alumno pepe = new ejercicio3.Alumno("Pepe");
		
		coordinador.apuntarse(pepe);
		coordinador.quejarse(new Queja("Soy pepe, me estoy quejando por segunda vez", pepe));
		
		
		// debe salir tambien la queja de paco y paco como alumno
		
		System.out.println("\nComprobacion de que es singleton");
		coordinador.consultarAlumnos();
		coordinador.consultarQuejas();
		
		
		
		
	}

}
