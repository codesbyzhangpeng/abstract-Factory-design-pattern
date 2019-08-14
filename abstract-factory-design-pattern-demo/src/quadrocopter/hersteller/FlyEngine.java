package quadrocopter.hersteller;

public class FlyEngine extends Engine{

	public FlyEngine() {
		System.out.println("Die FlyEngine wurde erfolgreich erzeugt!");
	}	
	
	@Override
	public void revCount() {
		System.out.println("Die aktuelle Drehzahl der FlyEngine betraegt " + this.getEngineSpeed() + " Umdrehungen / Minuten");
	}

}
