package cl.awakelab.clases;

public class Caguano extends Carro {

	private int alcanceDeTiro;
	private String colorConfeti;

	public Caguano() {
		super();
		RandomData azares = new RandomData();
		
		setAlcanceDeTiro(azares.getAlcance());
		setColorConfeti(azares.getColor());
		setModelo("Caguano");
	}

	public float getAlcanceDeTiro() {
		return alcanceDeTiro;
	}

	public void setAlcanceDeTiro(int alcanceDeTiro) {
		this.alcanceDeTiro = alcanceDeTiro;
	}

	public String getColorConfeti() {
		return colorConfeti;
	}

	public void setColorConfeti(String colorConfeti) {
		this.colorConfeti = colorConfeti;
	}

}
