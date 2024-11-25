package stampante.immagini;

import java.util.ArrayList;
import stampante.colore.Colore;

public class ImgRaster implements Stampabile {
	//creo una matrice di colori (e no di forme pk il raster è così)
	private ArrayList<ArrayList<Colore>> matricePixel = new ArrayList<ArrayList<Colore>>();
	private Colore colore;

	
	
	/**
	 * COSTRUTTORE
	 * @param matricePixel
	 */
	public ImgRaster(ArrayList<ArrayList<Colore>> matricePixel) {
		super();
		this.matricePixel = matricePixel;
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

	//i 3 metodi successivi tengono traccia dell'inchiostro residuo in base al colore
	@Override
	public double getInchiostroR() {
		double inkR = 0;
		
		for(int i=0; i<matricePixel.size(); i++) {
			for(int j=0; j<matricePixel.get(i).size(); j++) {
				inkR += (double) colore.getRed() / 255;
			}
		}
		return inkR;
	}

	@Override
	public double getInchiostroG() {
		double inkG = 0;
		
		for(int i=0; i<matricePixel.size(); i++) {
			for(int j=0; j<matricePixel.get(i).size(); j++) {
				inkG += (double) colore.getGreen() / 255;
			}
		}
		return inkG;
	}

	@Override
	public double getInchiostroB() {
		double inkB = 0;
		
		for(int i=0; i<matricePixel.size(); i++) {
			for(int j=0; j<matricePixel.get(i).size(); j++) {
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
	private void randPix(){
		for(int i=0; i<matricePixel.size(); i++) {
			for(int j=0; j<matricePixel.get(i).size(); j++) {
				//matricePixel.add((int) (255*Math.random()), (int) (255*Math.random()), (int) (255*Math.random()));
				Colore colore = new Colore((int) (255*Math.random()), (int) (255*Math.random()), (int) (255*Math.random()));
				matricePixel.get(j).add(colore);
            }
        }
    }

}
