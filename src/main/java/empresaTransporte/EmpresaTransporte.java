package empresaTransporte;

import java.util.ArrayList;

public class EmpresaTransporte {

	private String nombre;
	private String direccion;
	private ArrayList<Bus> buses;

	public EmpresaTransporte(String nombre, String direccion) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.buses = new ArrayList<Bus>();
	}

	public String getNombre() {
		return this.nombre;
	}

	/**
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return this.direccion;
	}

	/**
	 * 
	 * @param direccion
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public ArrayList<Bus> getBuses() {
		return this.buses;
	}

	/**
	 * 
	 * @param buses
	 */
	public void setBuses(ArrayList<Bus> buses) {
		this.buses = buses;
	}

	/**
	 * 
	 * @param matricula
	 */
	public void venderBus(String matricula) {
		for (Bus bus : buses) {
			if (bus.getMatricula().equals(matricula)) {
				buses.remove(bus);
				break;
			}
		}
	}

	/**
	 * 
	 * @param modelo
	 * @param matricula
	 * @param capacidad
	 */
	public void comprarBus(String modelo, String matricula, int capacidad) {
		Bus bus = new Bus(modelo, matricula, capacidad);
		buses.add(bus);
	}

}