package cl.awakelab.clases;

public class Huevo {
	private int fila;
	private int columna;
	private int puntaje;
	
	public Huevo (int fila,int columna) {
		this.fila = fila;
		this.columna = columna;
		this.puntaje = 0;
	}

	public int getFila() {
		return fila;
	}

	public void setFila(int fila) {
		this.fila = fila;
	}

	public int getColumna() {
		return columna;
	}

	public void setColumna(int columna) {
		this.columna = columna;
	}

	public int getPuntaje() {
		return puntaje;
	}

	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}

	@Override
	public String toString() {
		String retorno = String.format("%10s %-5s %10s %-5s%10s %-5s","Fila=",this.fila,"Columna=",this.columna,"Puntaje=",this.puntaje);
		return retorno;
	}
	
	
	

}
