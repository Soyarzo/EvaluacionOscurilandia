package cl.awakelab.ejecutable;

import cl.awakelab.clases.Tablero;
import cl.awakelab.clases.Carro;

public class OscarLandia {

	public static void main(String[] args) {
		
		
		
		Carro prueba1 = new Carro();
		
		System.out.println( prueba1.getColumna() + ","+prueba1.getFila() );
		System.out.println();
		
		
		Tablero juego = new Tablero();
		
		for (int i = 0;i<18;i++) {
			Carro prueba = new Carro();
			prueba = juego.getCarros()[i];
			
			System.out.println((i+1) + "-. " + prueba.getFila() + ","+prueba.getColumna() );
			
		}
		
		String[][] matrizJuego = new String[15][15];
		
		for (int i=0;i<15;i++) {
			//System.out.print((i+1));
			for(int j =0;j<15;j++) {
				//System.out.println(i);
				matrizJuego[i][j]="[ * ]";
				//System.out.print(matrizJuego[i][j]);
			}
			//System.out.println("");
		}
		
		
		for (int i = 0;i<18;i++) {
			if(juego.getCarros()[i].getModelo().equals("Kromi")) {
				System.out.println("encontrado kromi");
				System.out.println(juego.getCarros()[i].getFila()+ ","+juego.getCarros()[i].getColumna());
				matrizJuego[juego.getCarros()[i].getFila()][juego.getCarros()[i].getColumna()]= "[ k ]";
				matrizJuego[juego.getCarros()[i].getFila()+1][juego.getCarros()[i].getColumna()]= "[ k ]";
				matrizJuego[juego.getCarros()[i].getFila()+2][juego.getCarros()[i].getColumna()]= "[ k ]";
			}else if(juego.getCarros()[i].getModelo().equals("Caguano")) {
				System.out.println("encontrado caguano");
				System.out.println(juego.getCarros()[i].getFila()+ ","+juego.getCarros()[i].getColumna());
				matrizJuego[juego.getCarros()[i].getFila()][juego.getCarros()[i].getColumna()]= "[ c ]";
				matrizJuego[juego.getCarros()[i].getFila()][juego.getCarros()[i].getColumna()+1]= "[ c ]";
			}else if(juego.getCarros()[i].getModelo().equals("Trupalla")) {
				System.out.println("encontrado trupalla");
				System.out.println(juego.getCarros()[i].getFila()+ ","+juego.getCarros()[i].getColumna());
				matrizJuego[juego.getCarros()[i].getFila()][juego.getCarros()[i].getColumna()]= "[ t ]";
			}
		}
		
		

		System.out.println("    [0] "+"[1]  "+"[2]  "+"[3]  "+"[4]  "+"[5]  "+"[6]  "+"[7]  "+"[8]  "+"[9]  "+
		"[10] "+"[11] "+"[12] "+"[13] "+"[14] "+"[15]");
		for (int i=0;i<15;i++) {
			System.out.print("["+(i)+"]");
			for(int j =0;j<15;j++) {
			//	System.out.println(i);
				//matrizJuego[i][j]="[ * ]";
				System.out.print(matrizJuego[i][j]);
			}
			System.out.println("");
		}

		
		
		
	}

}
