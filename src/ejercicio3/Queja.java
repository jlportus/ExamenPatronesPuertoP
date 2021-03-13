package ejercicio3;

public class Queja {

	String queja;
	Alumno alumno;

	public Queja(String queja, Alumno alumno) {
		super();
		this.queja = queja;
		this.alumno = alumno;
	}

	@Override
	public String toString() {
		return "Queja de " + alumno + ": " + queja;
	}

	

}
