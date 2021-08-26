package ejercicos.interfaces;

public interface CajeroInterfaz {
	public void solicitarTarjeta(String numero);

	public void solicitarClave(String clave);

	public void solicitarTipoTransaccion();

	public void solicitarMonto(int monto);

	public void validarSaldo();

	public void entregarDinero();

	public void realizarTranzaccion();

	public void entregarRecibo();
}