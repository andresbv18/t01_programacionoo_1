package ejercicos.interfaces;

public class CajeroBancoPichincha implements CajeroInterfaz{

	@Override
	public void solicitarTarjeta(String numero) {
		// TODO Auto-generated method stub
		System.out.println("Validar targeta");
	}

	@Override
	public void solicitarClave(String clave) {
		// TODO Auto-generated method stub
		System.out.println("Validar clave");
	}

	@Override
	public void solicitarTipoTransaccion() {
		// TODO Auto-generated method stub
		System.out.println("Retirar dinero");
		System.out.println("Tranferencia");
		System.out.println("cuenta corriente");
		System.out.println("cuenta de ahorros");
	}

	@Override
	public void solicitarMonto(int monto) {
		// TODO Auto-generated method stub
		
		System.out.println("Digite el monto a retirar");
		//Switc (opcion)
		public void agendarCita();
		System.out.println("2_20");
		System.out.println("3_50");
		System.out.println("4_100");
	}

	@Override
	public void validarSaldo() {
		// TODO Auto-generated method stub
		//si saldoingresado es mayor al saldo total 
		//if(n<St)
		System.out.println("Su saldo es insuficiente digite otra cantidad");
		
	}

	@Override
	public void entregarDinero() {
		// TODO Auto-generated method stub
		System.out.println("Retire su dinero");
	}

	@Override
	public void realizarTranzaccion() {
		// TODO Auto-generated method stub
		
		System.out.println("");
	}

	@Override
	public void entregarRecibo() {
		// TODO Auto-generated method stub
		System.out.println("Retire su recibo");
	}

}
