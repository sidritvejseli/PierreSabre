package personnages;

public class Commercant extends Humain {
	public Commercant(String nom, int q_argent) {
		super(nom,"th�", q_argent);
	}
	
	private int  seFaireExtorquer() {
		return 0;
	}
	
	void recevoir(int argent) {
		this.q_argent += argent;
		parler(argent + "  sous ! Je te remercie g�n�reux donateur");
	}
	
}
