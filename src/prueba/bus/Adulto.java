package prueba.bus;

public class Adulto extends Persona{
	
	public String nombre;
	public String apellido;
	public int codigoSeguro;
	public String nombreEmpresa;
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
	public int getCodigoSeguro() {
		return codigoSeguro;
	}
	public void setCodigoSeguro(int codigoSeguro) {
		this.codigoSeguro = codigoSeguro;
	}
	public String getNombreEmpresa() {
		return nombreEmpresa;
	}
	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}
	@Override
	public String toString() {
		return "Adulto [nombre=" + nombre + ", apellido=" + apellido + ", codigoSeguro=" + codigoSeguro
				+ ", nombreEmpresa=" + nombreEmpresa + "]";
	}

}
