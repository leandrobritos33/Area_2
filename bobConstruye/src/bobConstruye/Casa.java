package bobConstruye;

public class Casa extends Edificio {

	int habitaciones;
	String color;

	public int getHabitaciones() {
		return habitaciones;
	}

	public void setHabitaciones(int habitaciones) {
		this.habitaciones = habitaciones;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Casa(Double mtCuadrados, String direccion, int habitaciones, String color) {
		super(mtCuadrados, direccion);
		this.habitaciones = habitaciones;
		this.color = color;
	}

}
