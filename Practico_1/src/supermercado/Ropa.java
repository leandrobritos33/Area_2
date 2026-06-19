package supermercado;

public class Ropa extends Producto {

	String color;
	int talle;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getTalle() {
		return talle;
	}

	public void setTalle(int talle) {
		this.talle = talle;
	}

	public Ropa(double precio, String marca, String color, int talle) {
		super(precio, marca);
		this.color = color;
		this.talle = talle;
	}

}
