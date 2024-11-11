package empresaOficinas;

public class OficinaCentral extends Oficina {

	private Departamento departamentoAsociado;

	public OficinaCentral(int numero, int capacidad, String direccion, Departamento departamentoAsociado) {
		super(numero, capacidad, direccion);
		this.departamentoAsociado = departamentoAsociado;
	}

	public Departamento getDepartamentoAsociado() {
		return this.departamentoAsociado;
	}

	/**
	 * 
	 * @param departamentoAsociado
	 */
	public void setDepartamentoAsociado(Departamento departamentoAsociado) {
		this.departamentoAsociado = departamentoAsociado;
	}

}