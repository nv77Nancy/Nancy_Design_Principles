package task7;

interface LandVehicle{
	public void runs();
}

interface AirVehicle{
	public void fly();
}

class Ford implements LandVehicle{
	public void runs(){
		System.out.println("Runs on Land");
	}
}

class Airbus implements AirVehicle{
	public void fly() {
		System.out.println("Flies in Air");
	}
}

class LandVehicleAdapter implements AirVehicle{
	
	LandVehicle landVehicle;
	LandVehicleAdapter(LandVehicle l){
		landVehicle=l;
	}
	
	public void fly() {
		landVehicle.runs();
	}
}

public class Adapter {
	public static void main(String[] args) {
		Ford ford=new Ford();
		ford.runs();
		
		Airbus airbus=new Airbus();
		airbus.fly();
		
		AirVehicle landVehicleAdapter=new LandVehicleAdapter(ford);
		landVehicleAdapter.fly();
	}
}
