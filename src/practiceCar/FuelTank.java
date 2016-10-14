package practiceCar;

public class FuelTank {

private double fuel;

public double getFuel() {
	return fuel;
}

public void setFuel(double fuel) {

	this.fuel = fuel;
	
}
public FuelTank(){
	
	this.fuel=0.0;
}

public FuelTank(double fuel) {
	
	this.fuel = fuel;
}
public void fuelUsage(){
	fuel--;
}

public void addFuel(double gas){
	fuel = gas;
}
	

}
