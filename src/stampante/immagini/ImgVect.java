package stampante.immagini;

import stampante.forme.Forma;
import stampante.colore.Colore;
import java.util.ArrayList;

public class ImgVect implements Stampabile{
	//contatore dell'ultima forma aggiunta
	private int formeMaxPerImm;
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
	
	
	@Override
	public void stampaComponenti() {
		System.out.println("Immagine Vettoriale:");
		for(int i=0; i<forme.size(); i++) {
			System.out.println(forme.get(i).toString());
		}
	}
	
	//i 3 metodi successivi tengono traccia dell'inchiostro residuo in base al colore
	@Override
	public double getInchiostroR() {
		double inkR = 0;
		for(int i=0; i<forme.size(); i++) {
			inkR+=forme.get(i).getColRedInBaseAdArea();
		}
		return inkR;
	}

	@Override
	public double getInchiostroG() {
		double inkG = 0;
		for(int i=0; i<forme.size(); i++) {
			inkG+=forme.get(i).getColGreenInBaseAdArea();
		}
		return inkG;
	}

	@Override
	public double getInchiostroB() {
		double inkB = 0;
		for(int i=0; i<forme.size(); i++) {
			inkB+=forme.get(i).getColBlueInBaseAdArea();
		}
		return inkB;
	}

	//tiene traccia del livello di tutte le cartucce ma in un solo comando
	@Override
	public double[] getAllInk() {
		//double[] inkRGB = {0, 0, 0};
		double[] inkTot = {0, 0, 0};
		for(int i=0; i<forme.size(); i++) {
			inkTot[0]+=forme.get(i).getColRedInBaseAdArea();
			inkTot[0]+=forme.get(i).getColRedInBaseAdArea();
			inkTot[0]+=forme.get(i).getColRedInBaseAdArea();
		}
		return inkTot;
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
