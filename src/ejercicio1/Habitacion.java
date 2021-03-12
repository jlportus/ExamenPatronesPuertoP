package ejercicio1;


import java.util.Collection;



public class Habitacion implements Covid19 {

	int numeroHabitacion;
	String nombrePaciente;
	String apellidosPaciente;
	String dNI;
	String fechaIngreso;
	boolean covidPositivo;
	

	public boolean isCovidPositivo() {
		return covidPositivo;
	}

	public void setCovidPositivo(boolean covidPositivo) {
		this.covidPositivo = covidPositivo;
	}

	public String getdNI() {
		return dNI;
	}

	public Habitacion(int numeroHabitacion, String nombrePaciente, String apellidosPaciente, String dNI,
			String fechaIngreso, boolean covidPositivo) {
		super();
		this.numeroHabitacion = numeroHabitacion;
		this.nombrePaciente = nombrePaciente;
		this.apellidosPaciente = apellidosPaciente;
		this.dNI = dNI;
		this.fechaIngreso = fechaIngreso;
		this.covidPositivo = covidPositivo;
	
	}

	@Override
	public int getNumeroInfectados() {
		int numeroInfectado = 0;
		if (covidPositivo) {
			numeroInfectado = 1;
		}
		return numeroInfectado;
	}

	@Override
	public void getElementos() {
		System.out.println(this.toString());
	}

	@Override
	public String toString() {
		return "Habitacion [numeroHabitacion=" + numeroHabitacion + ", nombrePaciente=" + nombrePaciente
				+ ", apellidosPaciente=" + apellidosPaciente + ", dNI=" + dNI + ", fechaIngreso=" + fechaIngreso
				+ ", covidPositivo=" + covidPositivo + "]";
	}
	
	

}
