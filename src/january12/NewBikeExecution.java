package january12;

public class NewBikeExecution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		NewBike pulsar=new NewBike("Bajaj Pulsar", 100,2);
		pulsar.displayName();
		pulsar.displaySpeed();
		int g=pulsar.returnGear();
		System.out.println("The number of gears is: "+g);
	}

}
