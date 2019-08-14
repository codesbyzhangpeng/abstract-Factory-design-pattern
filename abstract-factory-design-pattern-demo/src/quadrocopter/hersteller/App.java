package quadrocopter.hersteller;

public class App {
	
	public static void main(String[] args) {
		
		FlyFactory ff = new FlyFactory();
		
		ControllerBoard controller = new ControllerBoard(ff);
		
		QuadroFactory qf = new QuadroFactory();
	
		ControllerBoard controller2 = new ControllerBoard(qf);
	}

}
