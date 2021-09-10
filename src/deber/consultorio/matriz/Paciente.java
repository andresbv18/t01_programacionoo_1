package deber.consultorio.matriz;

public class Paciente implements Comparable<Paciente>{
	
	public String nombre;
	public String apellido;
	public int edad;
	public String sintoma;
	
	
	public Paciente() {
		nombre="";
		apellido="";
		edad=0;
		sintoma="";
	}
	
	public Paciente(String n,String m,int g,String gg) {
		
		nombre=n;
		apellido=m;
		edad=g;
		sintoma=gg;
	}
	
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
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getSintoma() {
		return sintoma;
	}
	public void setSintoma(String sintoma) {
		this.sintoma = sintoma;
	}

	@Override
	public int compareTo(Paciente o) {
		// TODO Auto-generated method stub
		if (this.edad > o.getEdad()) {
			return 1;
		} else if (this.edad == o.getEdad()) {
			return 0;
		} else {
			return -1;
		}
	}

	@Override
	public String toString() {
		return "Paciente [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", sintoma=" + sintoma
				+ "]";
	}

}
