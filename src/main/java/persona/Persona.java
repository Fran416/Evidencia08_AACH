package persona;

import java.util.ArrayList;

public class Persona {

	private String nombres;
	private String apellidos;
	private ArrayList<Persona> amigos;
	private String rut;

	public Persona(String nombres, String apellidos, String rut) {
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.amigos = new ArrayList<Persona>();
		this.rut = rut;
	}

	public void mostrarAmigos(){
		for (Persona amigo : amigos){
			System.out.println(amigo.nombres + " " + amigo.apellidos);
		}
	}

	public void eliminarAmigo(Persona persona){
		amigos.remove(persona);
	}

	public void agregarAmigo(Persona persona){
		amigos.add(persona);
	}

	public String getNombres() {
		return this.nombres;
	}

	/**
	 * 
	 * @param nombres
	 */
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return this.apellidos;
	}

	/**
	 * 
	 * @param apellidos
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public ArrayList<Persona> getAmigos() {
		return this.amigos;
	}

	/**
	 * 
	 * @param amigos
	 */
	public void setAmigos(ArrayList<Persona> amigos) {
		this.amigos = amigos;
	}

	public String getRut() {
		return this.rut;
	}

	/**
	 * 
	 * @param rut
	 */
	public void setRut(String rut) {
		this.rut = rut;
	}

}