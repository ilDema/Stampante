package stampante.immagini;

import stampante.forme.Forma;
import stampante.colore.Colore;
import java.util.ArrayList;

public class ImgVect {
	//contatore dell'ultima forma aggiunta
	private int formeMaxPerImm;
//	private Forma[] forme;
	//arrayList di forme
	private ArrayList<Forma> forme;
	
	
	
	/**
	 * COSTRUTTORE
	 * @param formeMaxPerImm
	 * @param forme
	 */
	public ImgVect(int formeMaxPerImm) {
		this.formeMaxPerImm = formeMaxPerImm;
		this.forme = new ArrayList<Forma>();
	}	


	
	//METODI
	//
	public void aggiungiForma(Forma formaFittizia) {
		this.forme.add(formaFittizia);
	}

	public double calcolaAreaTot() {
		double areaTotale=0;
		for(int i=0; i<forme.size(); i++) {
				areaTotale += forme.get(i).calcolaArea();	
		}
		return areaTotale;
	}
	
	public double calcolaAreaInBaseAColore(Colore coloreFittizio) {
		double areaColore=0;
		for(int i=0; i<forme.size(); i++) {
				if(this.forme.get(i).getColore().equals(coloreFittizio)){
				areaColore += forme.get(i).calcolaArea();
			}
		}
		//System.out.println(areaColore);
		return areaColore;
	}
	
	public void stampaComponenti() {
		System.out.println("Immagine Vettoriale:");
		for(int i=0; i<forme.size(); i++) {
			System.out.println(forme.get(i).toString());
		}
	}
	
	
	
	//GETTER E SETTER
	public int getFormeMaxPerImm() {
		return formeMaxPerImm;
	}


	public ArrayList<Forma> getForme() {
		return forme;
	}


	public void setForme(ArrayList<Forma> forme) {
		this.forme = forme;
	}
}
