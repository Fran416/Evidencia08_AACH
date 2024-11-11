package empresaOficinas;

public class Oficina {

	private int identificacion;
	private int capacidad;
	private String direccion;

	public Oficina(int identificacion, int capacidad, String direccion) {
		this.identificacion = identificacion;
		this.capacidad = capacidad;
		this.direccion = direccion;
	}

	public int getIdentificacion() {
		return this.identificacion;
	}

	/**
	 * 
	 * @param identificacion
	 */
	public void setIdentificacion(int identificacion) {
		this.identificacion = identificacion;
	}

	public int getCapacidad() {
		return this.capacidad;
	}

	/**
	 * 
	 * @param capacidad
	 */
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
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

}