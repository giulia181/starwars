package ste.starwars.personnages;

public class Serviteur extends Personnage {

	public Serviteur(String nom) {
		super(nom);
	}

	@Override
	public void afficherCamp() {
		System.out.println("Je suis "+super.nom+
				", je fais partie de l'empire galactique");
	}

}
