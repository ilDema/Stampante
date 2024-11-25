package stampante.eccezione;

public class EccezioneFineInchiostro extends RuntimeException{
	
	//metodo che serve a lanciare un'eccezione personalizzata
	public EccezioneFineInchiostro(String message) {
        super(message);
    }
}
