package january12;

public class BikeExecution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bike obj=new Bike();
		obj.displayName();
		obj.displaySpeed(70);
		
		int g=obj.returnGears();
		System.out.println("The number of gears is: "+g);
	}

}
