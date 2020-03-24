package task7;

class Vehicle{ 
    private static Vehicle single_instance = null;
    public String s; 

    private Vehicle() 
    { 
        s = "Vehicle is Running"; 
    } 

    public static Vehicle getInstance() 
    { 
        if (single_instance == null) 
            single_instance = new Vehicle(); 
        return single_instance; 
    } 
}

public class Singleton {
	public static void main(String[] args) {
		Vehicle v1=Vehicle.getInstance();
		Vehicle v2=Vehicle.getInstance();
		
		System.out.println(v1.s);
		System.out.println(v2.s);
		System.out.println();
		
		v1.s="Audi is Running";
		
		System.out.println(v1.s);
		System.out.println(v2.s);
	}
}
