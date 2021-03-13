package ejercicio3;

import java.util.ArrayList;
import java.util.Collection;

public class Coordinador {

	private static Collection<Alumno> alumnos;
	private static Collection<Queja> quejas;
	private static Coordinador COORDINADOR;
	
	static {
		alumnos = new ArrayList<>();
		quejas = new ArrayList<>();
		COORDINADOR = new Coordinador();
	}
	
	
	
	public Coordinador() {
		
	}
	
	public static Coordinador getInstanciaUnica () {

			return COORDINADOR;
	}
	
	public void apuntarse(Alumno alumno) {
		alumnos.add(alumno);
	}
	
	public void quejarse(Queja queja) {
		quejas.add(queja);
	}
	
	public void consultarQuejas(){
		System.out.println("Las quejas son: ");
		quejas.forEach(System.out::println);
		
	}
	
	public void consultarAlumnos(){
		System.out.println("Los alumnos son: ");
		alumnos.forEach(System.out::println);
	}
}
