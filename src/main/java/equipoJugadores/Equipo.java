package equipoJugadores;

import java.util.ArrayList;

public class Equipo {

	private String nombre;
	private Jugador capitan;
	private ArrayList<Jugador> jugadores;
	private String deporte;

	public Equipo(String nombre, Jugador capitan, String deporte) {
		this.nombre = nombre;
		this.capitan = capitan;
		this.jugadores = new ArrayList<Jugador>();
		this.deporte = deporte;
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

	public Jugador getCapitan() {
		return this.capitan;
	}

	/**
	 * 
	 * @param capitan
	 */
	public void setCapitan(Jugador capitan) {
		this.capitan = capitan;
	}

	public ArrayList<Jugador> getJugadores() {
		return this.jugadores;
	}

	/**
	 * 
	 * @param jugadores
	 */
	public void setJugadores(ArrayList<Jugador> jugadores) {
		this.jugadores = jugadores;
	}

	public String getDeporte() {
		return this.deporte;
	}

	/**
	 * 
	 * @param deporte
	 */
	public void setDeporte(String deporte) {
		this.deporte = deporte;
	}

	/**
	 * 
	 * @param numeroCamiseta
	 */
	public void eliminarJugador(int numeroCamiseta) {
		for (Jugador jugador : jugadores) {
			if (jugador.getNumeroCamiseta() == numeroCamiseta) {
				jugadores.remove(jugador);
				break;
			}
		}
	}

	/**
	 * 

	 * @param numeroCamiseta
	 */
	public void agregarJugador(Jugador jugador, int numeroCamiseta) {
		jugador.setNumeroCamiseta(numeroCamiseta);
		jugadores.add(jugador);
	}

	/**
	 * 
	 * @param numeroCamiseta
	 * @param nuevoNumeroCamiseta
	 */
	public void cambiarCamiseta(int numeroCamiseta, int nuevoNumeroCamiseta) {
		for (Jugador jugador : jugadores) {
			if (jugador.getNumeroCamiseta() == numeroCamiseta) {
				jugador.setNumeroCamiseta(nuevoNumeroCamiseta);
				break;
			}
		}
	}

}