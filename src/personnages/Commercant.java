package personnages;

public class Commercant extends Humain {
	public Commercant(String nom, int q_argent) {
		super(nom,"the", q_argent);
	}
	
	public int  seFaireExtorquer() {
		parler("J'ai tout perdu! Le monde est trop injuste...");

		return 0;
		
	}
	
	public void recevoir(int argent) {
		super.setQ_argent(super.q_argent +argent);
		parler(argent + "  sous ! Je te remercie g�n�reux donateur");
	}
	
}
