package deber.consultorio.ordenamiemto.copia;

public class PersonaRica {
	public String nombre;
	public String apellido;
	public int anyoNacimiento;
	public int edad;
	public int dinero;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	@Override
	public String toString() {
		return "PersonaRica [nombre=" + nombre + ", apellido=" + apellido + ", anyoNacimiento=" + anyoNacimiento
				+ ", edad=" + edad + ", dinero=" + dinero + "]";
	}
	public int getAnyoNacimiento() {
		return anyoNacimiento;
	}
	public void setAnyoNacimiento(int anyoNacimiento) {
		this.anyoNacimiento = anyoNacimiento;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getDinero() {
		return dinero;
	}
	public void setDinero(int dinero) {
		this.dinero = dinero;
	}
}
