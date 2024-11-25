package stampante.immagini;

public interface Stampabile {
	void stampaComponenti();
	double getInchiostroR();
    double getInchiostroG();
    double getInchiostroB();
    double[] getAllInk();
}
