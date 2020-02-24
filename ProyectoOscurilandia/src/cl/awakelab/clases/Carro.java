package cl.awakelab.clases;

public class Carro {
	
	int cantidadOcupantes;
	String fechaIngreso;
	int[] posicionTablero;
	
	public Carro() {
		this.posicionTablero = new int[2];
		
	}

	public int getCantidadOcupantes() {
		return cantidadOcupantes;
	}

	public void setCantidadOcupantes(int cantidadOcupantes) {
		this.cantidadOcupantes = cantidadOcupantes;
	}

	public String getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public int[] getPosicionTablero() {
		return posicionTablero;
	}

	public void setPosicionTablero(int alto,int ancho) {
		 this.posicionTablero[0]= alto;
		 this.posicionTablero[1]= ancho;
	}

	public abstract String modelo();

	@Override
	public String toString() {
		return "Carro [cantidadOcupantes=" + cantidadOcupantes + ", fechaIngreso=" + fechaIngreso + ", posicionTablero="
				+ posicionTablero + ", modelo()=" + modelo() + "]";
	}

}
