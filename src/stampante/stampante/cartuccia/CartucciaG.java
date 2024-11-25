package stampante.stampante.cartuccia;

import stampante.eccezione.EccezioneFineInchiostro;

public class CartucciaG extends Cartuccia{
	
	
	
	/**
	 * COSTRUTTORE
	 */
	public CartucciaG() {
		super();
	}
	
	
	
	//METODI
	@Override
	public void utilizzo(double quantita) {
		if(quantita>val){
			//lancia una nuova eccezione richiamando la classe apposita
            throw new EccezioneFineInchiostro("Inchiostro verde terminato");
        }
        val-=quantita;
	}

}
