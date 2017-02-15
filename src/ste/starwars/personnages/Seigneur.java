package ste.starwars.personnages;

public class Seigneur extends Serviteur implements Force {

	public Seigneur(String nom) {
		super(nom);
	}

	@Override
	public void utiliserForce() {
		System.out.println("La force est noire ...");
	}
	
	
}
