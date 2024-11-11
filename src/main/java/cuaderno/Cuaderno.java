package cuaderno;

import java.util.ArrayList;

public class Cuaderno {

	private String asignatura;
	private ArrayList<Hoja> hojas;

	public Cuaderno(String asignatura, ArrayList<Hoja> hojas) {
		this.asignatura = asignatura;
		this.hojas = new ArrayList<Hoja>(100);
		for (int i = 1; i <= 100; i++) {
			Hoja hoja = new Hoja(i);
			hojas.add(hoja);
		}
	}

	public String getAsignatura() {
		return this.asignatura;
	}

	/**
	 * 
	 * @param asignatura
	 */
	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}

	public ArrayList<Hoja> getHojas() {
		return this.hojas;
	}

	/**
	 * 
	 * @param hojas
	 */
	public void setHojas(ArrayList<Hoja> hojas) {
		this.hojas = hojas;
	}

	/**
	 * 
	 * @param numeroHoja
	 * @param apunte
	 */
	public void agregarApuntes(String apunte, int numeroHoja) {
		buscarHoja(numeroHoja).setApuntes(apunte);
	}

	/**
	 * 
	 * @param numeroHoja
	 */
	public String leerApuntes(int numeroHoja) {
		return buscarHoja(numeroHoja).getApuntes();
	}

	/**
	 * 
	 * @param numeroHoja
	 */
	public void sacarHoja(int numeroHoja) {
		hojas.remove(buscarHoja(numeroHoja));
	}

	public Hoja buscarHoja(int numeroHoja) {
		for (Hoja hoja : hojas) {
			if (hoja.getNumeroHoja() == numeroHoja) {
				return hoja;
			}
		}
		return null;
	}

}