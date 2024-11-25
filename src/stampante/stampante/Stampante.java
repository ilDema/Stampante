package stampante.stampante;

import stampante.eccezione.EccezioneFineInchiostro;
import stampante.immagini.Stampabile;
import stampante.stampante.cartuccia.*;

public class Stampante {
	private CartucciaR cartR;
	private CartucciaG cartG;
	private CartucciaB cartB;
	
	
	
	/**
	 * COSTRUTTORE
	 * @param cartR
	 * @param cartG
	 * @param cartB
	 */
	public Stampante(CartucciaR cartR, CartucciaG cartG, CartucciaB cartB) {
		this.cartR = cartR;
		this.cartG = cartG;
		this.cartB = cartB;
	}

	
	
	//METODI
	public boolean stampa(Stampabile immagine){
		//gestisco l'eccezione generata e propagata da cartuccia
		try {
		//consuma il valore della cartuccia rossa in base al tipo di forma (quindi in base ai pixel o al'area della forma)
		cartR.utilizzo(immagine.getInchiostroR());
		cartG.utilizzo(immagine.getInchiostroG());
		cartB.utilizzo(immagine.getInchiostroB());
		}catch(EccezioneFineInchiostro e) {
			System.out.println(e.getMessage()+". Ricaricare");
			return false;
		};
		immagine.stampaComponenti();
		return true;
	}

	
	
	
	//sostituzione cartuccia rossa (= ricaricarla)
		public void sostituzioneR_ricaricaR(){
			cartR.sostituisci();
		}
		
	//sostituzione cartuccia verde (= ricaricarla)
		public void sostituzioneV_ricaricaV(){
			cartG.sostituisci();
		}

	//sostituzione cartuccia blu (= ricaricarla)
		public void sostituzioneB_ricaricaB(){
			cartB.sostituisci();
		}
	
	
	//sostituzione di tutte le cartuccia (= ricaricarla)
	public void sostituzioneAll_ricaricaAll(){
		cartR.sostituisci();
		cartG.sostituisci();
		cartB.sostituisci();
	}
	
	//livello cartuccie
	public void livelloCartucce() {
		System.out.println("Livello cartucce: R="+ cartR.getVal() +"; "+
											 "G="+ cartG.getVal() +"; "+
											 "B="+ cartB.getVal() +"; ");

	}
	
	
}
