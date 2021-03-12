import ejercicio1.Habitacion;
import ejercicio1.UnidadHospitalaria;

public class App {

	public static void main(String[] args) {
		
		probarEjercicio1();
		

	}

	private static void probarEjercicio1() {
		
		Habitacion hab1 = new Habitacion(1, "Paco", "Perez", "111111", "8/2/20", true);
		Habitacion hab2 = new Habitacion(2, "Pepe", "Lopez", "222222", "8/2/20", true);
		Habitacion hab3 = new Habitacion(3, "Maria", "Gomez", "333333", "8/2/20", false);
		Habitacion hab4 = new Habitacion(4, "Ana", "Sanchez", "444444", "8/2/20", true);
		
		UnidadHospitalaria planta1 = new UnidadHospitalaria();
		planta1.añadirElemento(hab1);
		planta1.añadirElemento(hab2);
		planta1.añadirElemento(hab3);
		planta1.añadirElemento(hab4);
				
		System.out.println("Resultado del Ejercicio 1\nEl numero de infectados es de " + planta1.getNumeroInfectados());
		
	}

}
