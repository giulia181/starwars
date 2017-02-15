package ste.starwars.personnages;

public class Jedi extends Rebelle implements Force {

	public Jedi(String nom) {
		super(nom);
	}

	@Override
	public void utiliserForce() {
		System.out.println("Je combats la mal"
				+ " avec le côté lumineux de la force :)");
	}
	
	
	
}
