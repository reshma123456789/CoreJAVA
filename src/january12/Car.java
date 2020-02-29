package january12;

public class Car {

	String name;
	String color;
	int year;
	//Can be initialize here itself 
	//Can be initialized in method using Car.noOfGear=5;
	//Can be initialized through constructor
	static int noOfGears;
	
	/*Car(String cname,String ccolor,int cyear){
		name=cname;
		color=ccolor;
		year=cyear;
	}*/
	Car(String name,String color,int year){
		this.name=name;
		this.color=color;
		this.year=year;// this keyword is instance of class(Object)
		//this.displayDetails();// using this keyword one can invoke method from another method but same class
	}
	void displayDetails() {
		Car.noOfGears=5;
		System.out.println("The name of the car is: "+name);
		System.out.println("The color is: "+color);
		System.out.println("Year of manfacture: "+year);
		System.out.println("No. of gears: "+noOfGears);

	}
	void changeGear(int gear) {
		System.out.println("Changing to gear: "+gear);
		
	}
	int applyBrake() {
		int speed=120;
		return speed;
	}
	
	 static void applyBrakes() {
		System.out.println("Reducing speed....");
	}
}
