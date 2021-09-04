package prueba.bus;

import java.util.Scanner;

public class MainPrueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Adulto adulto1 = new Adulto();
		adulto1.setNombre("juan");
		adulto1.setApellido("Perez");
		adulto1.setCodigoSeguro(12345);
		adulto1.setNombreEmpresa("Cocacola");

		Adulto adulto2 = new Adulto();
		adulto2.setNombre("MARCO");
		adulto2.setApellido("LOPEZ");
		adulto2.setCodigoSeguro(12345);
		adulto2.setNombreEmpresa("CAHIDE");

		Adulto adulto3 = new Adulto();
		adulto3.setNombre("MARIA");
		adulto3.setApellido("CASTILLO");
		adulto3.setCodigoSeguro(12345);
		adulto3.setNombreEmpresa("FLORESTA");

		Adulto adulto4 = new Adulto();
		adulto4.setNombre("JUANA");
		adulto4.setApellido("PALAL");
		adulto4.setCodigoSeguro(12345);
		adulto4.setNombreEmpresa("BINANCE");

		Adulto adulto5 = new Adulto();
		adulto5.setNombre("MONICA");
		adulto5.setApellido("ZARATE");
		adulto5.setCodigoSeguro(12345);
		adulto5.setNombreEmpresa("AVIUANCA");

		Adulto adulto6 = new Adulto();
		adulto6.setNombre("PEDRO");
		adulto6.setApellido("MORAN");
		adulto6.setCodigoSeguro(12345);
		adulto6.setNombreEmpresa("PALERMO");

		Adulto adulto7 = new Adulto();
		adulto7.setNombre("MONICA");
		adulto7.setApellido("BENITEZ");
		adulto7.setCodigoSeguro(12345);
		adulto7.setNombreEmpresa("NAVAPAN");

		Adulto adulto8 = new Adulto();
		adulto8.setNombre("JUANCA");
		adulto8.setApellido("VERDUGO");
		adulto8.setCodigoSeguro(12345);
		adulto8.setNombreEmpresa("");

		Adulto adulto9 = new Adulto();
		adulto9.setNombre("ANDRES");
		adulto9.setApellido("POZO");
		adulto9.setCodigoSeguro(12345);
		adulto9.setNombreEmpresa("AIG");

		Adulto adulto10 = new Adulto();
		adulto10.setNombre("LUZ");
		adulto10.setApellido("BRIONES");
		adulto10.setCodigoSeguro(12345);
		adulto10.setNombreEmpresa("MIES");

		Adolescente Ado1 = new Adolescente();
		Ado1.setNombre("ANA");
		Ado1.setApellido("CUEVA");
		Ado1.setDeporte("FUTBOL");

		Adolescente Ado2 = new Adolescente();
		Ado2.setNombre("FRANCISCO");
		Ado2.setApellido("NARIÑO");
		Ado2.setDeporte("FUTSAL");

		Adolescente Ado3 = new Adolescente();
		Ado3.setNombre("CAMILA");
		Ado3.setApellido("PARALTA");
		Ado3.setDeporte("AJEDREZ");

		Adolescente Ado4 = new Adolescente();
		Ado4.setNombre("CARMITA");
		Ado4.setApellido("BRIONES");
		Ado4.setDeporte("NATACION");

		Adolescente Ado5 = new Adolescente();
		Ado5.setNombre("MERY");
		Ado5.setApellido("ZALZAR");
		Ado5.setDeporte("TIRO");

		Adolescente Ado6 = new Adolescente();
		Ado6.setNombre("ANTONY");
		Ado6.setApellido("CHACAHO");
		Ado6.setDeporte("CROSS");

		Adolescente Ado7 = new Adolescente();
		Ado7.setNombre("GEOVANY");
		Ado7.setApellido("CALLE");
		Ado7.setDeporte("BOLY");

		Adolescente Ado8 = new Adolescente();
		Ado8.setNombre("OSCAR");
		Ado8.setApellido("TORRES");
		Ado8.setDeporte("ATLETISMO");

		Adolescente Ado9 = new Adolescente();
		Ado9.setNombre("MELISA");
		Ado9.setApellido("CABRERA");
		Ado9.setDeporte("ALTEROFILIA");

		Adolescente Ado10 = new Adolescente();
		Ado10.setNombre("NANCY");
		Ado10.setApellido("GEONES");
		Ado10.setDeporte("LANZA BALA");

		Persona Bus[][] = new Persona[4][5];

		Bus[0][0] = adulto1;
		Bus[0][1] = adulto2;
		Bus[0][2] = adulto3;
		Bus[0][3] = adulto4;
		Bus[0][4] = adulto5;
		Bus[1][0] = Ado1;
		Bus[1][1] = Ado2;
		Bus[1][2] = Ado3;
		Bus[1][3] = Ado4;
		Bus[1][4] = Ado5;
		Bus[2][0] = Ado6;
		Bus[2][1] = Ado7;
		Bus[2][2] = Ado8;
		Bus[2][3] = Ado9;
		Bus[2][4] = Ado10;
		Bus[3][0] = adulto6;
		Bus[3][1] = adulto7;
		Bus[3][2] = adulto8;
		Bus[3][3] = adulto9;
		Bus[3][4] = adulto10;

		for (int fila = 0; fila < 4; fila++) {
			for (int columna = 0; columna < 5; columna++) {

				System.out.print(Bus[fila][columna] + " ");
			}
			System.out.println();

		}

	}
}
