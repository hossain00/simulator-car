package practiceCar;

public class Engine {
	

	private boolean engineOn;

	public boolean getEngineOn() {
		return engineOn;
	}

	public void setEngineOn(boolean engineOn) {
		this.engineOn = engineOn;
	}
	
	public Engine(){
		this.engineOn = false;
	}

	public Engine(boolean engineOn) {
		
		this.engineOn = engineOn;
	}
		
	
	}
	
	


