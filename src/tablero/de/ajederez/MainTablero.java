package tablero.de.ajederez;

import java.util.Arrays;

public class MainTablero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Peon peonBlanco1=new Peon();
peonBlanco1.setColor("Blanco");
peonBlanco1.setFigura("Peon");

Peon peonBlanco2=new Peon();
peonBlanco2.setColor("Blanco");
peonBlanco2.setFigura("Peon");

Peon peonBlanco3=new Peon();
peonBlanco3.setColor("Blanco");
peonBlanco3.setFigura("Peon");

Peon peonBlanco4=new Peon();
peonBlanco4.setColor("Blanco");
peonBlanco4.setFigura("Peon");

Peon peonBlanco5=new Peon();
peonBlanco5.setColor("Blanco");
peonBlanco5.setFigura("Peon");

Peon peonBlanco6=new Peon();
peonBlanco6.setColor("Blanco");
peonBlanco6.setFigura("Peon");

Peon peonBlanco7=new Peon();
peonBlanco7.setColor("Blanco");
peonBlanco7.setFigura("Peon");

Peon peonBlanco8=new Peon();
peonBlanco8.setColor("Blanco");
peonBlanco8.setFigura("Peon");



Peon peonNegro1=new Peon();
peonNegro1.setColor("Negro");
peonNegro1.setFigura("Peon");

Peon peonNegro2=new Peon();
peonNegro2.setColor("Negro");
peonNegro2.setFigura("Peon");

Peon peonNegro3=new Peon();
peonNegro3.setColor("Negro");
peonNegro3.setFigura("Peon");

Peon peonNegro4=new Peon();
peonNegro4.setColor("Negro");
peonNegro4.setFigura("Peon");

Peon peonNegro5=new Peon();
peonNegro5.setColor("Negro");
peonNegro5.setFigura("Peon");

Peon peonNegro6=new Peon();
peonNegro6.setColor("Negro");
peonNegro6.setFigura("Peon");

Peon peonNegro7=new Peon();
peonNegro7.setColor("Negro");
peonNegro7.setFigura("Peon");

Peon peonNegro8=new Peon();
peonNegro8.setColor("Negro");
peonNegro8.setFigura("Peon");

Alfil alfilBlancoA=new Alfil();
alfilBlancoA.setColor("Blanco");
alfilBlancoA.setFigura("Alfil");

Alfil alfilBlancoB=new Alfil();
alfilBlancoB.setColor("Blanco");
alfilBlancoB.setFigura("Alfil");

Alfil alfilNegroA=new Alfil();
alfilNegroA.setColor("Negro");
alfilNegroA.setFigura("Alfil");

Alfil alfilNegroB=new Alfil();
alfilNegroB.setColor("Negro");
alfilNegroB.setFigura("Alfil");

Caballo caballoBlancoA=new Caballo();
caballoBlancoA.setColor("Blanco");
caballoBlancoA.setFigura("Caballo");

Caballo caballoBlancoB=new Caballo();
caballoBlancoB.setColor("Blanco");
caballoBlancoB.setFigura("Caballo");

Caballo caballoNegroA=new Caballo();
caballoNegroA.setColor("Negro");
caballoNegroA.setFigura("Caballo");

Caballo caballoNegroB=new Caballo();
caballoNegroB.setColor("Negro");
caballoNegroB.setFigura("Caballo");

Torre TorreBalncaA=new Torre();
TorreBalncaA.setColor("Blanca");
TorreBalncaA.setFigura("Torre");

Torre TorreBlancaB=new Torre();
TorreBlancaB.setColor("Blanca");
TorreBlancaB.setFigura("Torre");

Torre TorreNegraA=new Torre();
TorreNegraA.setColor("Negro");
TorreNegraA.setFigura("Torre");

Torre TorreNegraB=new Torre();
TorreNegraB.setColor("Blanca");
TorreNegraB.setFigura("Torre");

Dama damaBlanca=new Dama();
damaBlanca.setColor("Blanco");
damaBlanca.setFigura("Dama");

Dama damaNegra=new Dama();
damaNegra.setColor("Negra");
damaNegra.setFigura("Dama");


Rey reyBlanco=new Rey();
reyBlanco.setColor("Blanco");
reyBlanco.setFigura("Rey");

Rey reyNegro= new Rey();
reyNegro.setColor("Negro");
reyNegro.setFigura("Rey");

Pieza figura[][]=new Pieza[8][8];
figura[0][0]=TorreBalncaA;
figura[0][1]=caballoBlancoA;
figura[0][2]=alfilBlancoA;
figura[0][3]=damaBlanca;
figura[0][4]=reyBlanco;
figura[0][5]=alfilBlancoB;
figura[0][6]=caballoBlancoB;
figura[0][7]=TorreBlancaB;

figura[1][0]=peonBlanco1;
figura[1][1]=peonBlanco2;
figura[1][2]=peonBlanco3;
figura[1][3]=peonBlanco4;
figura[1][4]=peonBlanco5;
figura[1][5]=peonBlanco6;
figura[1][6]=peonBlanco7;
figura[1][7]=peonBlanco8;


figura[6][0]=peonNegro1;
figura[6][1]=peonNegro2;
figura[6][2]=peonNegro3;
figura[6][3]=peonNegro4;
figura[6][4]=peonNegro5;
figura[6][5]=peonNegro6;
figura[6][6]=peonNegro7;
figura[6][7]=peonNegro8;


figura[7][0]=TorreNegraA;
figura[7][1]=caballoNegroA;
figura[7][2]=alfilNegroA;
figura[7][3]=damaNegra;
figura[7][4]=reyNegro;
figura[7][5]=alfilNegroB;
figura[7][6]=caballoNegroB;
figura[7][7]=TorreNegraB;

for (int x=0; x < figura.length; x++) {
	  System.out.print("  ");
	  for (int y=0; y < figura[x].length; y++) {
	    System.out.print(figura[x][y]+" ");
	    if (y!=figura[x].length-1) System.out.print("      ");
	  }
	  System.out.println("  ");
	}
	}
	
}
