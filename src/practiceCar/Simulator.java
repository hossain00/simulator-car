package practiceCar;

public class Simulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car = new Car();
		Car car2 = new Car("Ford","Explorer","2013");
		
		car.setMake("Toyota");
		car.setModel("Camry");
		car.setYear("2015");
		
		System.out.println("Year:" +car.getYear() + "|" + " Make:"
				+ "" + car.getMake() + "|" + " Model:" + car.getModel() + "|");
		
		car.run();
		car.run();
		car.run();
		
		
		car2.run();
		car2.addFuel(5);
		car2.engineOn();
		car2.run();
		
		
		
		car.addFuel(3);
		car.run();
		car.run();
		car.engineOn();
		car.run();
		car.run();
		car.run();
		car.run();
car.tireWear(7);


	}

}
