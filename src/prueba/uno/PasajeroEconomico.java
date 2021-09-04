package prueba.uno;

public class PasajeroEconomico extends Pasajero {
	private String codigoDescuento;
//Metodos Set y Get
	public String getCodigoDescuento() {
		return codigoDescuento;
	}

	public void setCodigoDescuento(String codigoDescuento) {
		this.codigoDescuento = codigoDescuento;
	}

	@Override
	public String toString() {
		return "PasajeroEconomico [codigoDescuento=" + codigoDescuento + "]";
	}

}
