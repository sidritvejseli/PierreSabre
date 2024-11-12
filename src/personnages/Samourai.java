package personnages;

public class Samourai extends Humain {
	String Seigneur;
	public Samourai(String Seigneur, String nom, String boisson_preferee, int q_argent) {
		super(nom, boisson_preferee, q_argent);
		this.Seigneur = Seigneur;
	}
	@Override
	public void direBonjour() {
		// TODO Auto-generated method stub
		super.direBonjour();
		parler( "Je suis fier de servir le seigneur " +this.Seigneur);
	}
	
	
	public void boire(String boisson) {
		
		parler( "Qu'est-ce que je vais choisir comme boisson ? Tiens je vais prendre\r\n"
				+ "du " +boisson);
	}
}
