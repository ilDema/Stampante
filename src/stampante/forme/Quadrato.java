package stampante.forme;

import stampante.colore.Colore;


public class Quadrato extends Forma{
	private double lato;

	
	
	/**
	 * COSTRUTTORE
	 * @param colore
	 * @param lato
	 */
	public Quadrato(Colore colore, double lato) {
		super(colore);
		this.lato = lato;
	}

	
	@Override
	public double calcolaPerimetro() {
		return lato*4;
	}
	
	@Override
	public double calcolaArea() {
		return lato*lato;
	}
	
	private double calcolaDiagonale(double lato) {
		return Math.sqrt((lato*lato)+(lato*lato));
	}
	
	@Override
	public String toString() {
		return  "Quadrato: " +
				"colore: " + this.colore + 
				", lato-->"  + lato   ;
	}
	
	
	
	//GETTER E SETTER
	public double getLato() {
		return lato;
	}


	public void setLato(double lato) {
		this.lato = lato;
	}
}
