package ejercicio2;

public class AlumnoET extends Alumno {

	public AlumnoET(String nombre, String rango, float calificacionExamen, int numeroParticipaciones,
			String[] regalos) {
		super(nombre, rango, calificacionExamen, numeroParticipaciones, regalos);
	}

	@Override
	float calcularNotaExamen() {

		float notaExamen = (this.calificacionExamen * 0.95f);
		if (notaExamen > 10) {
			notaExamen = 10;
		}
		return notaExamen;

	}

	@Override
	float calcularNotaParticipacion() {

		float notaParticipancion = (this.numeroParicipaciones * 1.25f);
		if (notaParticipancion > 10) {
			notaParticipancion = 10;
		}
		return notaParticipancion;
	}

	@Override
	float calcularNotaRegalos() {

		float notaTotalRegalos = this.regalos.length * this.nombre.length();

		if (notaTotalRegalos > 10) {
			notaTotalRegalos = 10;
		}

		return notaTotalRegalos;
	}
}
