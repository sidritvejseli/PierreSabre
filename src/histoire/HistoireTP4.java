package histoire;

import personnages.Commercant;

import personnages.Yakuza;

import personnages.Ronin;

public class HistoireTP4 {
	public static void main(String[] args) {
//		Humain Prof = new Humain("Prof", "kombucha", 54);
//		Prof.direBonjour();
//		Prof.acheter("boisson", 12);
//		Prof.acheter("jeu", 2);
//		Prof.acheter("kimono", 50);
		
		Commercant Marco  =  new  Commercant("Marco", 15);
//		Marco.direBonjour();
//		Marco.seFaireExtorquer();
//		Marco.recevoir(15);
//		Marco.boire();
		Yakuza yaku = new Yakuza("Warsong", "Yaku Le Noir");
		yaku.direBonjour();
		yaku.extorquer(Marco);
		
		Ronin roro = new Ronin("Roro");
		
		roro.direBonjour();
		roro.donner(Marco);
		
		roro.provoquer(yaku);
		
		
	}
}
