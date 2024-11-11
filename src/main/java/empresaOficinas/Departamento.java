package empresaOficinas;

import java.util.ArrayList;

public class Departamento {

	private String area;
	private ArrayList<Empleado> empleados;
	private Empleado administrador;

	public Departamento(String area, Empleado administrador) {
		this.area = area;
		this.empleados = new ArrayList<Empleado>();
		this.administrador = administrador;
	}

	public String getArea() {
		return this.area;
	}

	/**
	 * 
	 * @param area
	 */
	public void setArea(String area) {
		this.area = area;
	}

	public ArrayList<Empleado> getEmpleados() {
		return this.empleados;
	}

	/**
	 * 
	 * @param empleados
	 */
	public void setEmpleados(ArrayList<Empleado> empleados) {
		this.empleados = empleados;
	}

	public Empleado getAdministrador() {
		return this.administrador;
	}

	/**
	 * 
	 * @param administrador
	 */
	public void setAdministrador(Empleado administrador) {
		this.administrador = administrador;
	}

	public void agregarEmpleado(Empleado empleado) {
		this.empleados.add(empleado);
	}

}