import stampante.colore.*;
import stampante.forme.*;
import stampante.immagini.*;

public class Main {
	public static void main(String[] args) {
		/*
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
		ImgVect imm = new ImgVect(3);
		Colore coloreRed   = new Colore(255,   0,   0);
		Colore coloreGreen = new Colore(0  , 255,   0);
		Colore coloreBlue  = new Colore(0  ,   0, 255);

		
		Forma f1 = new Rettangolo(coloreRed, 5, 10);
		Forma f2 = new Cerchio   (coloreGreen  ,  5);
		Forma f3 = new Quadrato  (coloreBlue,  12.5);

		imm.aggiungiForma(f1);
		imm.aggiungiForma(f2);
		imm.aggiungiForma(f3);
		
		imm.calcolaAreaInBaseAColore(coloreRed);
		
		imm.stampaComponenti();

		
	}

}
