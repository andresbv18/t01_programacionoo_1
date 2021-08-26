package deber.interfaces;

public class CosultorioSanJuan implements ConsultorioInterfaz {

	@Override
	public void generarCita() {
		// TODO Auto-generated method stub
		System.out.println("Solicitar credencial");
	}

	@Override
	public void consultarCalendario() {
		// TODO Auto-generated method stub
		// si hay horarios disponibles
		System.out.println("Agendar cita");

	}

	@Override
	public void agendarCita() {
		// TODO Auto-generated method stub
		System.out.println("Generar datos de la cita");
	}

	@Override
	public void actualizarCita() {
		// TODO Auto-generated method stub
		System.out.println("Cancelar cita");
	}

	@Override
	public void consultarHistorial() {
		// TODO Auto-generated method stub
		System.out.println("Solicitar historial medico");
	}

	@Override
	public void realizarConsulta() {
		// TODO Auto-generated method stub
		System.out.println("REalizar analisis");
	}

	@Override
	public void generarDiagnostico() {
		// TODO Auto-generated method stub
		System.out.println("Entrega de datos del analisis");
	}

	@Override
	public void generarAltaMedica() {
		// TODO Auto-generated method stub
		// Si se logro solucionar el problema medico
		System.out.println("Su alta medica se generara");
	}

	@Override
	public void imprimirReceta() {
		// TODO Auto-generated method stub
		System.out.println("Datos de la medicina ");
	}

}
