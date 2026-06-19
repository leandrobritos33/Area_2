package supermercado;

public class Alimento extends Producto {

	String tipoAlimento;
	String vencimiento;

	public String getTipoAlimento() {
		return tipoAlimento;
	}

	public void setTipoAlimento(String tipoAlimento) {
		this.tipoAlimento = tipoAlimento;
	}

	public String getVencimiento() {
		return vencimiento;
	}

	public void setVencimiento(String vencimiento) {
		this.vencimiento = vencimiento;
	}

	public Alimento(double precio, String marca, String tipoAlimento, String vencimiento) {
		super(precio, marca);
		this.tipoAlimento = tipoAlimento;
		this.vencimiento = vencimiento;
	}

}
