package ste.starwars.personnages;

public class Rebelle extends Personnage {
	
	public Rebelle(String nom) {
		super(nom);
	}

	@Override
	public void afficherCamp() {
		System.out.println("Je suis "+super.nom+
				", je fais partie de l'alliance rebelle");
		
	}

}
