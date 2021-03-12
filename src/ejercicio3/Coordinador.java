package ejercicio3;

import java.util.ArrayList;
import java.util.Collection;

public class Coordinador {

	private static Collection<Alumno> alumnos;
	private static Collection<Queja> quejas;
	private static Coordinador COORDINADOR;
	
	
	
	private Coordinador() {
		alumnos = new ArrayList<>();
		quejas = new ArrayList<>();
	}
	
	public synchronized static Coordinador getInstanciaUnica () {
		if (COORDINADOR==null) {
			COORDINADOR = new Coordinador();
			quejas = new ArrayList<>();
			return COORDINADOR;
		}
		else return COORDINADOR;
	}
	
	public void apuntarse(Alumno alumno) {
		alumnos.add(alumno);
	}
	
	public void apuntarse(Queja queja) {
		quejas.add(queja);
	}
	
	public void consultarQuejas(){
		System.out.println(quejas);
	}
	
	public void consultarAlumnos(){
		System.out.println(alumnos);
	}
}
