package ejercicio02;

import java.util.ArrayList;

/**
 * Clase Hotel que administra un conjunto fijo de habitaciones.
 */
public class Hotel {

	ArrayList<Habitacion> listaHabitaciones;

	public Hotel() {
		listaHabitaciones = new ArrayList<>();
		for (int i = 1; i <= 10; i++) {
			Habitacion h = new Habitacion(i, true, 1200000); // precio por día
			listaHabitaciones.add(h);
		}
	}

	public Habitacion buscarHabitacionPorNumero(int numero) {
		for (Habitacion h : listaHabitaciones) {
			if (h.getNumeroHabitacion() == numero) {
				return h;
			}
		}
		return null;
	}
}

