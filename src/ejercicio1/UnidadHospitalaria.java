package ejercicio1;

import java.util.ArrayList;
import java.util.Collection;


public class UnidadHospitalaria implements Covid19 {

	Collection<Covid19> elementosHijos;
	
	public UnidadHospitalaria() {
		elementosHijos = new ArrayList<>();
	}
	
	public void añadirElemento(Habitacion habitacion){
		elementosHijos.add(habitacion);
	}
	
	@Override
	public int getNumeroInfectados() {
		int numeroInfectados = 0;
		for (Covid19 covid19 : elementosHijos) {
			numeroInfectados += covid19.getNumeroInfectados();
		}
		return numeroInfectados;
	}

	@Override
	public void getElementos() {
		for (Covid19 covid19 : elementosHijos) {
			covid19.getElementos();
		}
		 
	}

}
