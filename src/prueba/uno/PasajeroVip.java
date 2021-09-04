package prueba.uno;

public class PasajeroVip extends Pasajero{
	
	private String codigoMembresia;
	
	

	public PasajeroVip(String nombre,String apellido,String codigoMembresia,int edad) {
		super();
		this.codigoMembresia = codigoMembresia;
		this.nombre=nombre;
		this.apellido=apellido;
		this.edad=edad;
	}

	public PasajeroVip() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "PasajeroVip"+this.nombre+"  [codigoMembresia=" + codigoMembresia + "]";
	}

	public String getCodigoMembresia() {
		return codigoMembresia;
	}

	public void setCodigoMembresia(String codigoMembresia) {
		this.codigoMembresia = codigoMembresia;
	}
	

}
