package personnages;

public class Ronin extends Humain {
	int honneur;
	public Ronin(String nom, String boisson, int q_argent) {
		super(nom, boisson, q_argent);
		this.honneur = 1;
	}
	
	@Override
	public String getNom() {
		// TODO Auto-generated method stub
		return super.getNom();
	}
	public int getHonneur() {
		return honneur;
	}
	public void setHonneur(int honneur) {
		this.honneur = honneur;
	}
	
	public void donner(Commercant beneficiaire) {
		super.parler(beneficiaire.getNom()+ " prend ces " + super.getQ_argent()/10 + 
				" sous");
		beneficiaire.recevoir(super.getQ_argent()/10);
		super.setQ_argent(super.getQ_argent() - super.getQ_argent()/10);
	}
	
	
	public void provoquer(Yakuza adverssaire) {
		super.parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
		if ( 2*getHonneur()>= adverssaire.getReputation()) {
			super.parler("Je t’ai eu petit yakusa!");
			super.setQ_argent(getQ_argent()+ adverssaire.getQ_argent());
			adverssaire.setQ_argent(adverssaire.perdre());
			setHonneur(getHonneur()+1);
		}
		else {
			super.parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
			adverssaire.gagner(super.getQ_argent());
			super.setQ_argent(0);
		}
	}
}
