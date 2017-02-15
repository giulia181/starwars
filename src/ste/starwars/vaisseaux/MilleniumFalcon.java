package ste.starwars.vaisseaux;

public class MilleniumFalcon extends Alliance {

		public MilleniumFalcon() {
			super(20);
			//System.out.println("Millenium créé");
			//super.nbMissiles=20;
		}
		
		@Override
		public void afficherType(){
			System.out.println("MilleniumFalcon");
		}
		
		public void vitesseDeLaLumiere(){
			System.out.println("Accrochez-vous! ");
		}
}
