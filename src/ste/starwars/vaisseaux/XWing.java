package ste.starwars.vaisseaux;

public class XWing extends Alliance{
	
	public XWing() {
		super(10);
	}

	@Override
	public void afficherType(){
		System.out.println("XWing");
	}
	
}
