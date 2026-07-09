package interfase;

public class dinosaurio implements acciones {

	String nombre;

	@Override
	public void comer() {
		System.out.println("el dinosaurio come 4 gramos de comida");

	}

	@Override
	public void dormir() {
		System.out.println("nose cuanto duerme");

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public dinosaurio(String nombre) {
		super();
		this.nombre = nombre;
	}

}
