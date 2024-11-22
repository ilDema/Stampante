package stampante.forme;

import stampante.colore.Colore;

public class Cerchio extends Forma{
	private double raggio;

	
	
	/**
	 * COSTRUTTORE
	 * @param colore
	 * @param raggio
	 */
	public Cerchio(Colore colore, double raggio) {
		super(colore);
		this.raggio = raggio;
	}

	
	
	//METODI
	@Override
	public double calcolaPerimetro() {
		return 2*Math.PI*raggio;
	}
	
	@Override
	public double calcolaArea() {
		return Math.PI*raggio*raggio;
	}

	@Override
	public String toString() {
		return  "Cerchio: "   +
				"colore: " + this.colore + 
				", raggio-->"  + raggio   ;
	}
	
	
	
	
	//GETTER E SETTER
	public double getRaggio() {
		return raggio;
	}


	public void setRaggio(double raggio) {
		this.raggio = raggio;
	}
}