package quadrocopter.hersteller;

public class QuadroEngine extends Engine{

	public QuadroEngine() {
		System.out.println("Die QuadroEngine wurde erfolgreich erzeugt!");
	}
	
	@Override
	public void revCount() {
		System.out.println("Die aktuelle Drehzahl des QuadroEngine betraegt " + this.getEngineSpeed() + " Umdrehungen / Minute");
	}

}
