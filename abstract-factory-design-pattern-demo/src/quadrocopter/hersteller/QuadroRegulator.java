package quadrocopter.hersteller;

public class QuadroRegulator extends Regulator{

	public QuadroRegulator() {
		System.out.println("Der QudroRegulator wurde erfolgreich erzeugt!");
	}
	
	@Override
	public void increaseVoltage() {
		System.out.println("Die Spannung des QuadroRegulator wurde um 12 V erhoeht");
	}

}
