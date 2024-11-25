package esecuzione;

import stampante.colore.Colore;
import stampante.immagini.*;
import stampante.stampante.Stampante;
import stampante.forme.*;

public class Main {
	public static void main(String[] args) {
		/*
		//Versione 1
		ImgVect imm = new ImgVect(3);
		
		Forma f1 = new Rettangolo()
		Forma f2 = new Cerchio   (Colore.RED  ,  5);
		Forma f3 = new Cerchio   (Colore.BLACK, 10);

		
		imm.aggiungiForma(f1);
		imm.aggiungiForma(f2);
		imm.aggiungiForma(f3);
		
		
		imm.calcolaAreaInBaseAColore(Colore.BLACK);
		
		
		
		
		imm.stampaComponenti();
		*/
		
		/*
		//Versione 2
		ImgVect imm = new ImgVect(3);
		Colore coloreRed   = new Colore(255,   0,   0);
		Colore coloreGreen = new Colore(0  , 255,   0);
		Colore coloreBlue  = new Colore(0  ,   0, 255);

		
		Forma f1 = new Rettangolo(coloreRed,    5, 10);
		Forma f2 = new Cerchio   (coloreGreen,  5);
		Forma f3 = new Quadrato  (coloreBlue,  12.5);

		imm.aggiungiForma(f1);
		imm.aggiungiForma(f2);
		imm.aggiungiForma(f3);
		
		imm.calcolaAreaInBaseAColore(coloreRed);
		
		imm.stampaComponenti();
		*/
		
		//Versione 3
		Stampante stampante = new Stampante();
		
		//test con immagne raster
		ImgRaster r = new ImgRaster(10, 10);
		
		stampante.livelloCartucce();
		stampante.stampa(r);
		stampante.livelloCartucce();

		System.out.println("");
		
		stampante.sostituzioneAll_ricaricaAll();
		stampante.livelloCartucce();
		
		
		
		System.out.println("-----------------------------------------------------------------------------------------------");
		
		
		
		//test con immagine vettoriale
		ImgVect v = new ImgVect(5);
		
		Colore coloreRed   = new Colore(255,   0,   0);
		Colore coloreGreen = new Colore(0  , 255,   0);
		Colore coloreBlue  = new Colore(0  ,   0, 255);

		
		Forma f1 = new Rettangolo(coloreRed,   5, 10);
		Forma f2 = new Cerchio   (coloreGreen, 5);
		Forma f3 = new Quadrato  (coloreBlue,  12.5);
		
		v.aggiungiForma(f1);
		v.aggiungiForma(f2);
		v.aggiungiForma(f3);
		
		stampante.livelloCartucce();
		stampante.stampa(v);
		stampante.livelloCartucce();
		
		System.out.println("");
		
		stampante.sostituzioneAll_ricaricaAll();
		stampante.livelloCartucce();

	}

}
