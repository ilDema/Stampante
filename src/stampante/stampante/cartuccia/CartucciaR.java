package stampante.stampante.cartuccia;

import stampante.eccezione.EccezioneFineInchiostro;

public class CartucciaR extends Cartuccia{

	
	
	/**
	 * COSTRUTTORE
	 */
	public CartucciaR() {
		super();
	}

	
	
	//METODI
	//propago l'eccezione (nel caso in cui finisca l'inchiostro) che verrà gestita da stampante
	@Override
	public void utilizzo(double quantita) {
		if(quantita>val){
			//lancia una nuova eccezione richiamando la classe apposita
            throw new EccezioneFineInchiostro("Inchiostro rosso terminato");
        }
        val-=quantita;
	}

}
