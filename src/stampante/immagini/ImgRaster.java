package stampante.immagini;

import java.util.ArrayList;
import stampante.colore.Colore;

public class ImgRaster implements Stampabile {
	//creo una matrice di colori (e no di forme pk il raster è così)
	//private ArrayList<ArrayList<Colore>> matricePixel = new ArrayList<ArrayList<Colore>>();
	private Colore[][] matricePixel;
	//private Colore colore;

	/**
	 * vecchio COSTRUTTORE
	 * @param matricePixel
	 
	public ImgRaster(ArrayList<ArrayList<Colore>> matricePixel) {
		this.matricePixel = matricePixel;
	}
	*/
	
	
	/**
	 * COSTRUTTORE
	 * @param matricePixel
	 */
	public ImgRaster(int righe, int colonne) {
		this.matricePixel = new Colore[righe][colonne];
		
		//SOLO PER TESTING
		randPixel();
	}

	//METODI
	//stampa del contenuto di ogni immagine specificando la percentuale di R,G.B rispetto al totale
	@Override
	public void stampaComponenti() {
		double r=getInchiostroR();
		double g=getInchiostroG();
		double b=getInchiostroB();
		double totale=r+g+b;
		
		r=(r/totale)*100;
		g=(g/totale)*100;
		b=(b/totale)*100;
		
		System.out.println("Immagine Raster:");
		System.out.println("R: "+ r +"; "+
						   "G: "+ g +"; "+
						   "B: "+ b);
	}

	
	/*
	 * vecchio ciclo per la matrice di array list
	for(int i=0; i<matricePixel.size(); i++) {
		for(int j=0; j<matricePixel.get(i).size(); j++) {
			inkR += (double) colore.getRed() / 255;
		}
	}
	*/
	
	
	//i 3 metodi successivi tengono traccia dell'inchiostro residuo in base al colore
	@Override
	public double getInchiostroR() {
		double inkR = 0;
		
		for(int i=0; i<matricePixel.length; i++) {
			Colore[] matrix = matricePixel[i];
			for(int j=0; j<matrix.length; j++) {
				Colore colore = matrix[j];
				inkR += (double) colore.getRed() / 255;
			}
		}
		return inkR;
	}

	@Override
	public double getInchiostroG() {
		double inkG = 0;
		
		for(int i=0; i<matricePixel.length; i++) {
			Colore[] matrix = matricePixel[i];
			for(int j=0; j<matrix.length; j++) {
				Colore colore = matrix[j];
				inkG += (double) colore.getGreen() / 255;
			}
		}
		return inkG;
	}

	@Override
	public double getInchiostroB() {
		double inkB = 0;
		
		for(int i=0; i<matricePixel.length; i++) {
			Colore[] matrix = matricePixel[i];
			for(int j=0; j<matrix.length; j++) {
				Colore colore = matrix[j];
				inkB += (double) colore.getBlue() / 255;
			}
		}
		return inkB;
	}

	//tiene traccia del livello di tutte le cartucce ma in un solo comando
	@Override
	public double[] getAllInk() {
		double[] inkTot = {0, 0, 0};
		
		inkTot[0] = getInchiostroR();
		inkTot[1] = getInchiostroG();
		inkTot[2] = getInchiostroB();
		
		return inkTot;
	}
	
	
	
	
	
	
	
	
	
	//SOLO PER TESTING
	public void randPixel(){
		for(int riga=0; riga<matricePixel.length; riga++) {
			for(int colonna=0; colonna<matricePixel[riga].length; colonna++) {
				//matricePixel.add((int) (255*Math.random()), (int) (255*Math.random()), (int) (255*Math.random()));
				Colore colore = new Colore((int) (255*Math.random()), (int) (255*Math.random()), (int) (255*Math.random()));
				matricePixel[riga][colonna] = colore;
            }
        }
    }
	
	/*
	 * vecchio metodo per randomizzare
	public void randPixel(){
		for(int i=0; i<matricePixel.size(); i++) {
			for(int j=0; j<matricePixel.get(i).size(); j++) {
				//matricePixel.add((int) (255*Math.random()), (int) (255*Math.random()), (int) (255*Math.random()));
				Colore colore = new Colore((int) (255*Math.random()), (int) (255*Math.random()), (int) (255*Math.random()));
				matricePixel.get(j).add(colore);
            }
        }
    }
    */

}
