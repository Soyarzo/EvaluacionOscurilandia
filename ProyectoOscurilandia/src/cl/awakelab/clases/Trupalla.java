package cl.awakelab.clases;

public class Trupalla extends Carro {

	String armadura;
	String conductor;

	public Trupalla() {
		super();
		RandomData azares = new RandomData();
		
		this.armadura = azares.getArmadura();
		this.conductor = azares.getNombreCompleto();
	}

	@Override
	public String modelo() {

		return "Trupalla";
	}
}
