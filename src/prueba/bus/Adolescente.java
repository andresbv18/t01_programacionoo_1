package prueba.bus;

public class Adolescente extends Persona {
	public String nombre;
	public String apellido;
	public String Deporte;

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

	public String getDeporte() {
		return Deporte;
	}

	public void setDeporte(String deporte) {
		Deporte = deporte;
	}

	@Override
	public String toString() {
		return "Adolescente [nombre=" + nombre + ", apellido=" + apellido + ", Deporte=" + Deporte + "]";
	}
}
