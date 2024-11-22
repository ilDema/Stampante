package stampante.forme;

import stampante.colore.Colore;


public abstract class Forma {
	protected Colore colore;
	
	
	
	/**
	 * COSTRUTTORE
	 * @param colore
	 */
	public Forma(Colore colore) {
		this.colore = colore;
	}

	
	
	//METODI
	//in base all'area consuma più o meno colore
	public double getColRed() {
		return colore.getRed()/255*calcolaArea();
	}
	public double getColGreen() {
		return colore.getGreen()/255*calcolaArea();
	}
	public double getColBlue() {
		return colore.getBlue()/255*calcolaArea();
	}
	
	
//	public boolean equalsColore(Colore colore) {
//		return this.colore.equals(colore);
//	}
	
	
	
	//METODI astratti
	public abstract double calcolaPerimetro();
	public abstract double calcolaArea     ();
	public abstract String toString        ();


	//GETTER E SETTER
	public Colore getColore() {
		return colore;
	}
	public void setColore(Colore colore) {
		this.colore = colore;
	}	
}
