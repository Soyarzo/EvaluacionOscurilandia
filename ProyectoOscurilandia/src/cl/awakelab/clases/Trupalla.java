package cl.awakelab.clases;

public class Trupalla extends Carro {

	private int armadura;
	private String conductor;

	public Trupalla() {
		super();
		RandomData azares = new RandomData();
		
		
		setArmadura(azares.getArmadura());
		setConductor(azares.getNombreCompleto());
		setModelo("Trupalla");
	}

	public int getArmadura() {
		return armadura;
	}

	public void setArmadura(int armadura) {
		this.armadura = armadura;
	}

	public String getConductor() {
		return conductor;
	}

	public void setConductor(String conductor) {
		this.conductor = conductor;
	}


}
