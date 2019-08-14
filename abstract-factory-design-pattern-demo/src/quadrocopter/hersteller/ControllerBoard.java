package quadrocopter.hersteller;

public class ControllerBoard {
	
	private QuadrocopterFactory usedFactory;
	private Regulator regulator;
	private Engine engine;
	
	public ControllerBoard(QuadrocopterFactory usedFactory) {
		this.usedFactory = usedFactory;
		createQuadrocopterParts();
	}

	private void createQuadrocopterParts() {

		regulator = usedFactory.createRegulator();
		
		regulator.setCurrentVoltage(400);

		regulator.increaseVoltage();
		
		
		engine = usedFactory.createEngine();
		
		engine.setEngineSpeed(2000);
		
		engine.revCount();
	}
	
	
	

}
