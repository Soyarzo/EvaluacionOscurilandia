package cl.awakelab.clases;

public class Kromi extends Carro {
	

	String marca;
	String fechaFabricacion;

	public Kromi() {
		super();
		RandomData azares = new RandomData();
		
		this.marca = azares.getMarca();
		this.fechaFabricacion = azares.getFecha();
	}

	@Override
	public String modelo() {

		return "Kromi";
	}

}

