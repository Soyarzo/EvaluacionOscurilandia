package cl.awakelab.clases;

import java.util.Arrays;

public class Carro {
	
	private int cantidadOcupantes;
	private String fechaIngreso;
	private int[] posicionTablero = new int[2];
	private String modelo;
	private int fila;
	private int columna;
	
	
	public Carro() {
		RandomData azares = new RandomData();
		setPosicionTablero(getFila(),getColumna());
		setCantidadOcupantes(RandomData.azar(0, 10));
		setFechaIngreso(azares.getFecha());
		setFila();
		setColumna();
	}
	

	public int getFila() {
		return fila;
	}


	public void setFila() {
		this.fila = RandomData.azar(0, 12);
	}


	public int getColumna() {
		return columna;
	}


	public void setColumna() {
		this.columna = RandomData.azar(0, 13);
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

	public void setPosicionTablero(int fila,int columna) {
		 this.posicionTablero[0]= fila;
		 this.posicionTablero[1]= columna;
	}

	public String getModelo() {
		return this.modelo;
		
	}
		
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "Carro [cantidadOcupantes=" + cantidadOcupantes + 
				", fechaIngreso=" + fechaIngreso + ", posicionTablero="
				+ Arrays.toString(posicionTablero) + ", modelo=" + modelo + "]";
	}

	

}
