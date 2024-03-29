package quadrocopter.hersteller;

public abstract class Engine {
	
	private double engineSpeed; // Drehzahl des Motors
	
	public abstract void revCount(); // Drehzahlmesser

	public double getEngineSpeed() {
		return engineSpeed;
	}

	public void setEngineSpeed(double engineSpeed) {
		this.engineSpeed = engineSpeed;
	}

}
