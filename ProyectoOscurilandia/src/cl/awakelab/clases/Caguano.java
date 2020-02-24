package cl.awakelab.clases;

public class Caguano extends Carro {

	float alcanceDeTiro;
	String color;

	public Caguano() {
		super();
		RandomData azares = new RandomData();
		
		this.alcanceDeTiro = azares.getAlcance();
		this.color = azares.getColor();
	}

	@Override
	public String modelo() {

		return "Caguano";
	}
}
