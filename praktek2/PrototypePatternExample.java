public class PrototypePatternExample {
	public static void main(String[] args) throws
	CloneNotSupportedException
	{
		System.out.println("Nim : 011027042");
	System.out.println("***Prototype Pattern Demo***\n");
	BasicCar nano = new Nano("Green Nano") ;
	nano.basePrice=100000;
	BasicCar ford = new Ford("Ford Yellow");
	ford.basePrice=500000;
	BasicCar bc1;
	//Nano
	bc1 =nano.clone();
	//Price will be more than 100000 for sure
	bc1.onRoadPrice = nano.basePrice+BasicCar.setAdditionalPrice();
	System.out.println("Car is: "+ bc1.modelName+" and it's price is Rp."+bc1.onRoadPrice +bc1.nim );
	//Ford
	bc1 =ford.clone();
	//Price will be more than 500000 for sure
	bc1.onRoadPrice = ford.basePrice+BasicCar.setAdditionalPrice();
	System.out.println("Car is: "+ bc1.modelName+" and it's price is Rp."+bc1.onRoadPrice);
	}
}
