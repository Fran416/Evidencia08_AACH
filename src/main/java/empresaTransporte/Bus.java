package empresaTransporte;

public class Bus {

	private String modelo;
	private String matricula;
	private int capacidad;
	private String estado;

	public Bus(String modelo, String matricula, int capacidad) {
		this.modelo = modelo;
		this.matricula = matricula;
		this.capacidad = capacidad;
		this.estado = "Bueno";
	}

	public String getModelo() {
		return this.modelo;
	}

	/**
	 * 
	 * @param modelo
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMatricula() {
		return this.matricula;
	}

	/**
	 * 
	 * @param matricula
	 */
	public void setMatricula(String matricula) {
		this.matricula = matricula;
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

	public String getEstado() {
		return this.estado;
	}

	/**
	 * 
	 * @param estado
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}

	public void realizarMantenimiento() {
		// TODO - implement Bus.realizarMantenimiento
		throw new UnsupportedOperationException();
	}



}