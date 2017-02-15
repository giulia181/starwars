package ste.starwars.vaisseaux;

public abstract class Vaisseau {
	
	protected int nbMissiles;
	
	public Vaisseau(int nbMisssiles){
		this.nbMissiles = nbMisssiles;
	}
	
	public void tirerMissiles(){
		this.nbMissiles--;
	}
	
	public void decoller(){
		System.out.println("Je décolle !");
	}
	
	public abstract void afficherType();
	
}
