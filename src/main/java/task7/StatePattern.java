package task7;

interface VehicleType {
	void action();
	void mileage();
}

class twoWheeler implements VehicleType{
	public void action() {
		System.out.println("Runs on Land");
	}
	public void mileage() {
		System.out.println("High");
	}
}

class fourWheeler implements VehicleType{
	public void action() {
		System.out.println("Runs on Land");
	}
	public void mileage() {
		System.out.println("Medium");
	}
}

class airplane implements VehicleType{
	public void action() {
		System.out.println("Flies in Air");
	}
	public void mileage() {
		System.out.println("Low");
	}
}


class StatePatternDemo{
	VehicleType vehicle;
	
	StatePatternDemo(String choice){
		if(choice.equals("Car")) {
			vehicle=new fourWheeler();
		}
		else if(choice.equals("Bike")) {
			vehicle=new twoWheeler();
		}
		else {
			vehicle=new airplane();
		}
		vehicle.action();
		vehicle.mileage();
	}
}

public class StatePattern {
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		StatePatternDemo statePatternDemo=new StatePatternDemo("Airplane");
		System.out.println();
		statePatternDemo=new StatePatternDemo("Bike");
		System.out.println();
		statePatternDemo=new StatePatternDemo("Car");
	}
}
