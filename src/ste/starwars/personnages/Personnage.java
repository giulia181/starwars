package ste.starwars.personnages;

public abstract class Personnage {
	
	protected String nom;
	
	public Personnage(String nom){
		this.nom=nom;
	}
	
	public abstract void afficherCamp();
	
	
}
