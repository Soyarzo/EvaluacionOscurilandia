package cl.awakelab.clases;

import java.util.ArrayList;

import cl.awakelab.clases.Carro;

public class Tablero {
	
	private final int KROMI= 0;
	private final int TRUPALLA=1;
	private final int CAGUANO= 2;

	private Carro[] carros;
	private ArrayList<Huevo> huevos;
	
	
	public Tablero() {
		carros = new Carro[18];
		llenarTablero();
		huevos = new ArrayList();	
	}
	
	
	
	public Carro[] getCarros() {
		return carros;
	}



	public ArrayList<Huevo> getHuevos() {
		return huevos;
	}



	public void crearCarro(int modelo) {
		
		boolean creado =false;
		
		switch(modelo) {
		
		case 0:
			Kromi kromi = new Kromi();
			
			for (int i = 0; i<18 && creado!=true;i++) {
				if (carros[i]==null) {
					carros[i]=kromi;
					creado = true;
					if(i>0) {
						cambioPosicionTablero(i);	
					}
				}
			}
			break;
		case 1:
			Trupalla trupalla = new Trupalla();
			
			for (int i = 0; i<18 && creado!=true;i++) {
				if (carros[i]==null) {
					carros[i]=trupalla;
					creado = true;
					if(i>0) {
						cambioPosicionTablero(i);	
					}
				}
			}
			break;
		case 2:
			Caguano caguano = new Caguano();
			
			for (int i = 0; i<18 && creado!=true;i++) {
				if (carros[i]==null) {
					carros[i]=caguano;
					creado = true;
					if(i>0) {
						cambioPosicionTablero(i);	
					}
				}
			}
			break;
		}	
		
	}
	
	public void cambioPosicionTablero(int i) {
		
		System.out.println( "realizando cambios en index i " + i + "--");
		
		for (int j=0; j<i;j++) {
			 
			
			
			if(carros[j].getModelo().equals("Kromi")) {
				
				
				do {
					System.out.println(carros[i].getFila()+","+carros[i].getColumna() +" = " +carros[j].getFila()+","+carros[j].getColumna());
					if (carros[i].getFila()==carros[j].getFila() && carros[i].getColumna()==carros[j].getColumna()) {
						carros[i].setColumna();
						carros[i].setFila();
						j=0;
					}else {
						if (carros[j].getFila()+1==carros[i].getFila()) {
							carros[i].setFila();
							j=0;
						}else {
							if (carros[j].getFila()+2==carros[i].getFila()) {
								carros[i].setFila();
								j=0;
							}
						}
					}
				}while ((carros[i].getFila()==carros[j].getFila() && carros[i].getColumna()==carros[j].getColumna()) 
						|| carros[j].getFila()+1==carros[i].getFila() || carros[j].getFila()+2==carros[i].getFila());
			}
			
			if (carros[j].getModelo().equals("Caguano")) {
				
				do {
					System.out.println(carros[i].getFila()+","+carros[i].getColumna() +" = " +carros[j].getFila()+","+carros[j].getColumna());
					if(carros[i].getFila()==carros[j].getFila() && carros[i].getColumna()==carros[j].getColumna()) {
						carros[i].setColumna();
						carros[i].setFila();
						j=0;
					}else {
						if (carros[j].getColumna()+1==carros[i].getColumna()) {
							carros[i].setColumna();
							j=0;
						}
					}	
				}while((carros[i].getFila()==carros[j].getFila() && carros[i].getColumna()==carros[j].getColumna())
						|| carros[j].getColumna()+1==carros[i].getColumna());
			}
			
			if (carros[j].getModelo().equals("Trupalla")) {
				do {
					System.out.println(carros[i].getFila()+","+carros[i].getColumna() +" = " +carros[j].getFila()+","+carros[j].getColumna());
					if(carros[i].getFila()==carros[j].getFila() && carros[i].getColumna()==carros[j].getColumna()) {
						carros[i].setColumna();
						carros[i].setFila();
						j=0;
					}
				}while(carros[i].getFila()==carros[j].getFila() && carros[i].getColumna()==carros[j].getColumna());
				
			}	
		}	
	}
	
	
	public void llenarTablero() {
		
		for (int i =0; i<3;i++) {
			crearCarro(KROMI);
		}
		for (int i=3;i<8;i++) {
			crearCarro(CAGUANO);
		}
		for (int i=8;i<18;i++) {
			crearCarro(TRUPALLA);
		}	
	}
	
}
