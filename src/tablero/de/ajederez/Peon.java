package tablero.de.ajederez;

public class Peon extends Pieza {
public String color;
public String Figura;
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public String getFigura() {
	return Figura;
}
public void setFigura(String figura) {
	Figura = figura;
}
@Override
public String toString() {
	return "Peon color " + color + "";
}
}
