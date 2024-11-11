package equipoJugadores;

public class Jugador {

	private String nombre;
	private String apellido;
	private int numeroCamiseta;

	public Jugador(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.numeroCamiseta = -1;
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

	public String getApellido() {
		return this.apellido;
	}

	/**
	 * 
	 * @param apellido
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getNumeroCamiseta() {
		return this.numeroCamiseta;
	}

	/**
	 * 
	 * @param numeroCamiseta
	 */
	public void setNumeroCamiseta(int numeroCamiseta) {
		this.numeroCamiseta = numeroCamiseta;
	}

}