package deber.interfaces;

public class BibliotecaCentral implements BibliotecaInterfaz {

	@Override
	public void consultarCatalogo() {
		// TODO Auto-generated method stub
		System.out.println("Buscar libro");
	}

	@Override
	public void solicitarCredencial() {
		// TODO Auto-generated method stub
		System.out.println("Registrar datos");
	}

	@Override
	public void prestarLibro() {
		// TODO Auto-generated method stub
		System.out.println("Validar datos");
	}

	@Override
	public void generarBoleta() {
		// TODO Auto-generated method stub
		System.out.println("Datos del prestamo");
		System.out.println("Fecha de retiro y entrga");
	}

}
