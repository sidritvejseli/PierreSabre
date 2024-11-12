package personnages;

public class Yakuza extends Humain {
	
	String clan;
	int reputation;
	public Yakuza(String nom,String boisson, int q_argent, String clan) {
		
		super(nom, boisson, q_argent);
		this.clan = clan;
		this.reputation = 3;
		
			
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
	
	protected int perdre() {
		this.reputation -=1;
		super.parler("J'ai perdu mon duel et mes " + super.getQ_argent()
		+ " sous, snif.. J'ai desnohore le clan de "+ getClan());
		return 0;
	}
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		super.parler("Mon clan est celui de "+ clan);
		
	}
	
	protected void gagner(int gain) {
		this.reputation +=1;
		super.setQ_argent(super.getQ_argent()+ gain);
		super.parler("Ce ronin pensait vraiment battre " + super.getNom()
		+ " du clan de "+ getClan() + "? Je l'ai dépouillé de ses "+ gain);
		
	}
	
}
