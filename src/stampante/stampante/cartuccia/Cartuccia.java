package stampante.stampante.cartuccia;

import stampante.eccezione.EccezioneFineInchiostro;

public abstract class Cartuccia {
	protected double val;

	
	//COSTRUTTORE
    public Cartuccia() {
        val = 1000;
    }

    
    //METODI
    public boolean sostituisci(){
        val=1000;
        return true;
    }
    
    /*
     * metodo astratto che nel caso l'inchiostro che viene richiesto è maggiore di quello 
     * che c'è lancia un'eccezione personalizzata
     */
    public abstract void utilizzo(double quantita) throws EccezioneFineInchiostro;

    //GETTER E SETTER
    //mi serve per sapere il livello residuo di colore per singola cartuccia
	public double getVal() {
		return val;
	}
}
