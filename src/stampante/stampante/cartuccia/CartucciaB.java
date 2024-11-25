package stampante.stampante.cartuccia;

import stampante.eccezione.EccezioneFineInchiostro;

public class CartucciaB extends Cartuccia{
	
	
	
	/**
	 * COSTRUTTORE
	 */
	public CartucciaB() {
		super();
	}

	
	
	//METODI
	@Override
	public void utilizzo(double quantita) {
		if(quantita>val){
			//lancia una nuova eccezione richiamando la classe apposita
            throw new EccezioneFineInchiostro("Inchiostro blu terminato");
        }
        val-=quantita;
	}

}
