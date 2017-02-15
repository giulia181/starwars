package ste.starwars;

import ste.starwars.stations.DeathStar;
import ste.starwars.vaisseaux.Alliance;
import ste.starwars.vaisseaux.Corelli;
import ste.starwars.vaisseaux.XWing;

public class Main {

	public static void main(String[] args) {
		DeathStar station = new DeathStar();
	//	Vaisseau v = new Vaisseau();
		XWing vaisseauDeLuke = new XWing();
		//MilleniumFalcon vaisseauDeHan = new MilleniumFalcon();
		Corelli cor = new Corelli();
		
		station.attirerVaisseau(vaisseauDeLuke);
		System.out.println("\n\n\n");
		station.attirerVaisseau(cor);
		System.out.println("\n\n\n");
		Alliance v = new XWing();
		station.attirerVaisseau(v);
		//vaisseauDeHan.vitesseDeLaLumiere();
		
		
	}

}
