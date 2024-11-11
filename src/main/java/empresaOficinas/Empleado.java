package empresaOficinas;

public class Empleado {

	private String nombre;
	private String apellido;
	private String indentificacion;

	public Empleado(String nombre, String apellido, String indentificacion) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.indentificacion = indentificacion;
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

	public String getIndentificacion() {
		return this.indentificacion;
	}

	/**
	 * 
	 * @param indentificacion
	 */
	public void setIndentificacion(String indentificacion) {
		this.indentificacion = indentificacion;
	}

}