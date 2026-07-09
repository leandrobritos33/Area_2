package interfase;

public class Perro implements acciones {
	String nombre;

	@Override
	public void comer() {
		System.out.println("el perro come 2 toneladas de comida");
	}

	@Override
	public void dormir() {

		System.out.println("el perro duerme 4 segundos");
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Perro(String nombre) {
		super();
		this.nombre = nombre;
	}

}
