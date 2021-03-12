package ejercicio2;

public abstract class Alumno {

	String nombre;
	String rango;

	float calificacionExamen;
	int numeroParicipaciones;
	String[] regalos;

	public Alumno(String nombre, String rango, float calificacionExamen, int numeroParticipaciones, String[] regalos) {
		this.nombre = nombre;
		this.rango = rango;
		this.calificacionExamen = calificacionExamen;
		this.numeroParicipaciones = numeroParticipaciones;
		this.regalos = regalos;
	}

	abstract float calcularNotaExamen();

	abstract float calcularNotaParticipacion();

	abstract float calcularNotaRegalos();

	public float calificacion() {
		return calcularNotaExamen()*0.25f + calcularNotaParticipacion()*0.3f + calcularNotaRegalos()*0.45f;
	}

}
