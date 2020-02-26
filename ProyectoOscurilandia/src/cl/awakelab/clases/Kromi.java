package cl.awakelab.clases;

public class Kromi extends Carro {

	private String marca;
	private String fechaFabricacion;

	public Kromi() {
		super();
		RandomData azares = new RandomData();

		setMarca(azares.getMarca());
		setFechaFabricacion(azares.getFecha());
		setModelo("Kromi");
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getFechaFabricacion() {
		return fechaFabricacion;
	}

	public void setFechaFabricacion(String fechaFabricacion) {
		this.fechaFabricacion = fechaFabricacion;
	}

}
