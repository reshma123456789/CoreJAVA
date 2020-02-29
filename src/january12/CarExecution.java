package january12;

public class CarExecution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car c=new Car("VV","Black",2019);
		c.displayDetails();
		c.changeGear(2);
		int s=c.applyBrake();
		System.out.println("Speed reached after applying brakes: "+s);
		
		//Static method doesnot require object to be created
		//Can access through class
		Car.applyBrakes();
		

	}

}
