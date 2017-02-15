package ste.starwars.stations;

import ste.starwars.vaisseaux.Alliance;
import ste.starwars.vaisseaux.Empire;
import ste.starwars.vaisseaux.Vaisseau;

public class DeathStar {
	
	public void attirerVaisseau(Alliance vaisseau){
		System.out.println("Vaisseau de l'alliance capturé !");
		vaisseau.afficherType();
		vaisseau.appelerObiwan();
		System.out.println();
	}
	
	
	public void attirerVaisseau(Empire vaisseau){
		System.out.print("Vaisseau impérial ");
		vaisseau.afficherType();
		System.out.println("Autorisé à décoller ");
		vaisseau.confirmerOrdre();
		vaisseau.decoller();
	}
	
	public void attirerVaisseau(Vaisseau vaisseau){
		System.out.print("Vaisseau attiré : ");
		vaisseau.afficherType();
		System.out.println("Rayon désactivé : ");
		vaisseau.decoller();
	}
	
	
}
