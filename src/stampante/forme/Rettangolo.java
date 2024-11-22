package stampante.forme;

import stampante.colore.Colore;

public class Rettangolo extends Forma{
	private double base;
	private double altezza;
	
	
	
	/**
	 * COSTRUTTORE
	 * @param colore
	 * @param base
	 * @param altezza
	 */
	public Rettangolo(Colore colore, double base, double altezza) {
		super(colore);
		this.base = base;
		this.altezza = altezza;
	}

	
	
	//METODI
	@Override
	public double calcolaPerimetro() {
		return (base+altezza)*2;
	}
	
	@Override
	public double calcolaArea() {
		return base*altezza;
	}
	
	private double calcolaDiagonale(double base, double altezza) {
		return Math.sqrt((base*base)+(altezza*altezza));
	}

	//inverte base e altezza
	public void switchVal() {
		double appoggio;
		appoggio = altezza;
		this.altezza=base;
		this.base = appoggio;
	}
	
	
	
	//GETTER E SETTER
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltezza() {
		return altezza;
	}

	public void setAltezza(double altezza) {
		this.altezza = altezza;
	}

	
	@Override
	public String toString() {
		return  "Rettangolo: "   +
				"colore: " + this.colore + 
				", base-->"      + base    +
				", altezza-->"   + altezza   ;
	}	
	
}
