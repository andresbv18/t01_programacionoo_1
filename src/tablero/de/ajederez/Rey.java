package tablero.de.ajederez;

public class Rey extends Pieza {
	public String color;
	public String figura;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getFigura() {
		return figura;
	}
	public void setFigura(String figura) {
		this.figura = figura;
	}
	@Override
	public String toString() {
		return "Rey color=" + color + "";
	}

}
