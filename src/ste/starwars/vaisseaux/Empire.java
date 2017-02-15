package ste.starwars.vaisseaux;

public abstract class Empire extends Vaisseau {

	public Empire(int nbMissiles){
		super(nbMissiles);
	}
	
	public void confirmerOrdre(){
		System.out.println("A vos ordres Dark Vador ! ");
	}

}
