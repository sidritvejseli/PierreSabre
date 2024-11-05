package personnages;

public class Humain {

	String nom;
	String boisson_preferee;
	int q_argent;
	
	public Humain(String nom, String boisson_preferee, int q_argent) {
		this.boisson_preferee =boisson_preferee;
		this.nom = nom; 
		this.q_argent = q_argent;
	}
	public String getNom() {
		return nom;
	}
	
	protected void setQ_argent(int q_argent) {
		this.q_argent = q_argent;
	}
	
	
	public String getBoisson_preferee() {
		return boisson_preferee;
	}
	public int getQ_argent() {
		return q_argent;
	}
	
	 public void gagnerArgent(int gain) {
		this.q_argent+=gain;
	}
	 
	 public void perdreArgent(int perte) {
		 this.q_argent-=perte;
	}
	 
	 public void direBonjour() {
		
		parler("Bonjour ! Je m'appelle " + getNom() + " et j'aime boire du "+ getBoisson_preferee());
	}
	 protected void parler(String phrase) {
		 System.out.println("(" + getNom() + ") - " + phrase);
		
	}
	 public void acheter(String produit, int prix) {
		 if (prix > getQ_argent()) {
			 System.out.println("Je n'ai plus que "+ getQ_argent() + " sous en poche. Je ne peux m�me pas m'offrir un" + produit + " a " + prix+ " sous");
		 }
		 else {
			 System.out.println("j'ai "+ getQ_argent() + " sous en poche " + "Je vais pouvoir m'offrir "+ produit + " a " + prix+ " sous");
			 if (produit == "boisson") {
				 boire();
			 }
			 perdreArgent(prix);
		 }
		
	}
	public void boire() {
		System.out.println("(" + getNom() + ") - " + "Mmmm, un bon verre de "+ getBoisson_preferee() + " GLOUPS !");
		
	}
}
