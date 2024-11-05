package personnages;

public class Yakuza extends Humain {
	
	String clan;
	int reputation;
	public Yakuza(String clan, String nom) {
		
		super(nom, "whiskey", 30);
		this.clan = clan;
		this.reputation = 0;
		
			
	}
	
	public void setClan(String clan) {
		this.clan = clan;
	}
	
	public void setReputation(int reputation) {
		this.reputation = reputation;
	}
	
	public String getClan() {
		return clan;
	}
	 public int getReputation() {
		return reputation;
	}
	 
	public void extorquer(Commercant victime) {
		super.parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		super.parler(victime.nom + ", si tu tiens a la vie donne moi ta bourse");
		int gain =  victime.getQ_argent();
		victime.setQ_argent(victime.seFaireExtorquer());
		super.setQ_argent(super.q_argent+gain);
		super.parler("J'ai pique les "+ gain + " sous de "+ victime.getNom() + " ce qui me fait "+ super.q_argent
				+ "dans ma poche. Hi! Hi!");
		setReputation(getReputation()+1);
		
	}
	
}
