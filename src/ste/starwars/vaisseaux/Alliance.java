package ste.starwars.vaisseaux;

public abstract class Alliance extends Vaisseau {

	public Alliance(int nbMisssiles) {
		super(nbMisssiles);
	}

	public void appelerObiwan(){
		System.out.println("Au secours Obiwan !");
	}

}
