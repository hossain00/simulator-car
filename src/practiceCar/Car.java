package practiceCar;


public class Car  {
	private String make;
	private String model;
	private String year;
	private Engine enginestatus;
	private FuelTank fuel;
	
	
	
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	
	public Engine getEnginestatus() {
		return enginestatus;
	}
	public void setEnginestatus(Engine enginestatus) {
		this.enginestatus = enginestatus;
	}
	public FuelTank getFuel() {
		return fuel;
	}
	public void setFuel(FuelTank fuel) {
		this.fuel = fuel;
	}
	
	{
		fuel = new FuelTank();
		enginestatus = new Engine();
		
	}
	 
	
	public Car(){

		this.make = "";
		this.model = "";
		this.year = "";
		
		
	}
	public Car(String make, String model, String year){
		
		this.make = make;
		this.model = model;
		this.year = year;
		
	}
	
	
	
	
	public void run(){
		

		Double remainingFuel = fuel.getFuel();
		
		
		if(remainingFuel>=0 && enginestatus.getEngineOn() ){
			System.out.println("Running, fuel remaining = " + remainingFuel);
			
			fuel.fuelUsage();
			if (remainingFuel==0){
				enginestatus.setEngineOn(false);
				System.out.println("Car is not running, Fuel tank is empty!!");
			}
				
	  }else{
			System.out.println("Car is not running, check engine and fuel tank!!");
			}
	}
	public void engineOn() {
	   
	   enginestatus.setEngineOn(true);
		
	}
	public double addFuel(double gas){
		fuel.addFuel(gas);
		return gas ;
	}
    
	public void tireWear (int depth){
		Wheels wheel = new Wheels();
		if (depth<=11 && depth>1){
			int thread = (depth*10);
		
	 wheel.setTireThread(thread) ;
	 System.out.println(wheel.getTireThread()+"%");
}
		}
	
	
	

}
