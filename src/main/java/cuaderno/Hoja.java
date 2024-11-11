package cuaderno;

public class Hoja {

	private String apuntes;
	private int numeroHoja;

	public Hoja(int numeroHoja) {
		this.apuntes = "";
		this.numeroHoja = numeroHoja;
	}

	public String getApuntes() {
		return this.apuntes;
	}

	/**
	 * 
	 * @param apuntes
	 */
	public void setApuntes(String apuntes) {
		this.apuntes = apuntes;
	}

	public int getNumeroHoja() {
		return this.numeroHoja;
	}

	/**
	 * 
	 * @param numeroHoja
	 */
	public void setNumeroHoja(int numeroHoja) {
		this.numeroHoja = numeroHoja;
	}

}