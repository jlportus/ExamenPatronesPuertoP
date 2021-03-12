package ejercicio2;

public class AlumnoGC extends Alumno {

	public AlumnoGC(String nombre, String rango, float calificacionExamen, int numeroParticipaciones,
			String[] regalos) {
		super(nombre, rango, calificacionExamen, numeroParticipaciones, regalos);
	}

	@Override
	float calcularNotaExamen() {

		float notaExamen = (this.calificacionExamen * 1.05f);
		if (notaExamen > 10) {
			notaExamen = 10;
		}
		return notaExamen;

	}

	@Override
	float calcularNotaParticipacion() {

		float notaParticipancion = (this.numeroParicipaciones / 2.0f);
		if (notaParticipancion > 10) {
			notaParticipancion = 10;
		}
		return notaParticipancion;
	}

	@Override
	float calcularNotaRegalos() {

		float notaTotalRegalos = this.regalos.length * this.rango.length();
		if (notaTotalRegalos > 10) {
			notaTotalRegalos = 10;
		}

		return notaTotalRegalos;
	}

}
