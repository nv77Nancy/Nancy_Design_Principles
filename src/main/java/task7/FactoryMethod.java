package task7;

interface Bank{
	int getInterest();
}

class SBI implements Bank{
	public int getInterest() {
		return 5;
	}
}

class PNB implements Bank{
	public int getInterest() {
		return 6;
	}
}

class ICICI implements Bank{
	public int getInterest() {
		return 7;
	}
}

class GetInterestFactory{
	public Bank getInterestFactory(String type) {
		if(type.equals("SBI"))	return new SBI();
		else if(type.equals("ICICI"))	return new ICICI();
		else if(type.equals("PNB"))	return new PNB();
		
		//default will be PNB
		else return new PNB();
	}
}

public class FactoryMethod {
	public static void main(String[] args) {
		
		GetInterestFactory getInterestFactory=new GetInterestFactory();
		
		Bank bank = getInterestFactory.getInterestFactory("SBI");
		System.out.println("SBI Rate of Interest is : "+bank.getInterest());
		
		bank = getInterestFactory.getInterestFactory("ICICI");
		System.out.println("ICICI Rate of Interest is : "+bank.getInterest());
		
		bank = getInterestFactory.getInterestFactory("PNB");
		System.out.println("PNB Rate of Interest is : "+bank.getInterest());
		
	}
}