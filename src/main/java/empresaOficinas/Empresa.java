package empresaOficinas;

import java.util.ArrayList;

public class Empresa {

	private String nombre;
	private ArrayList<Departamento> departamentos;
	private ArrayList<Oficina> oficinas;
	private ArrayList<OficinaCentral> oficinasCentrales;
	private ArrayList<Empleado> empleadosSinDepartamento;

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Departamento> getDepartamentos() {
		return this.departamentos;
	}

	public void setDepartamentos(ArrayList<Departamento> departamentos) {
		this.departamentos = departamentos;
	}

	public ArrayList<Oficina> getOficinas() {
		return this.oficinas;
	}

	public void setOficinas(ArrayList<Oficina> oficinas) {
		this.oficinas = oficinas;
	}

	public ArrayList<OficinaCentral> getOficinasCentrales() {
		return this.oficinasCentrales;
	}

	public void setOficinasCentrales(ArrayList<OficinaCentral> oficinasCentrales) {
		this.oficinasCentrales = oficinasCentrales;
	}

	public void agregarOficina(int identificacion, int capacidad, String direccion) {
		oficinas.add(new Oficina(identificacion, capacidad, direccion));
	}

	public void crearDepartamento(String area, Empleado administrador) {
		Departamento departamento = new Departamento(area, administrador);
	}

	public void cambiarAdministrador(Departamento departamento, Empleado administrador) {
		departamento.setAdministrador(administrador);
	}

	public void agregarOficinaCentral(int identificacion, int capacidad, String direccion, Departamento departamentoAsociado) {
		OficinaCentral oficinaCentral = new OficinaCentral(identificacion, capacidad, direccion, departamentoAsociado);
		oficinasCentrales.add(oficinaCentral);
	}

	public void moverEmpleados(Departamento departamento, String identificacion) {
		for (Empleado empleado : empleadosSinDepartamento) {
			if (empleado.getIndentificacion().equals(identificacion)) {
				departamento.agregarEmpleado(empleado);
			}
		}
	}

	public void contratarEmpleado( String nombres, String apellidos, String identificacion) {
		Empleado empleado = new Empleado(nombres, apellidos, identificacion);
		empleadosSinDepartamento.add(empleado);
	}


}