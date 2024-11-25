package stampante.colore;
 
import stampante.colore.Colore;


public class Colore {
	private int red, green, blue;
	
	
	
	/**
	 * COSTRUTTORE
	 * @param red
	 * @param blue
	 * @param green
	 */
	public Colore(int red, int green, int blue) {
		this.red   = red;
		this.green = green;
		this.blue  = blue;
	}
	
	
	
	//METODI
	@Override
	public boolean equals(Object o) {
		if(this == o) return true;
		if(o == null || getClass() != o.getClass()) return false;
		
		Colore colore = (Colore) o;
		return red == colore.red && green == colore.green && blue == colore.blue;
	}

	@Override
	public String toString() {
		return  "Rosso: " + this.red   +", "+
				"Green: " + this.green +", "+
				"Blue:" +   this.blue  +"; ";
	}

	
	//GETTER E SETTER
	public int getRed() {
		return red;
	}
	public void setRed(int red) {
		this.red = red;
	}
	public int getGreen() {
		return green;
	}
	public void setGreen(int green) {
		this.green = green;
	}
	public int getBlue() {
		return blue;
	}
	public void setBlue(int blue) {
		this.blue = blue;
	}	
}
