package personnages;

public class Ronin extends Humain {
	int honneur;
	public Ronin(String nom) {
		super(nom, "shochu", 60);
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
}
