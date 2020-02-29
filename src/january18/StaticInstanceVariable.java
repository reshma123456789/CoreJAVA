package january18;

public class StaticInstanceVariable {

	//Difference between instance variable and class variable
	int counter=0; //Each time the new  object is created new memory is allocated, so will be initialized to 0
	static int counter1=0;// Every time the new object is created same memory is allocated
	
	void increment() {
		counter++;
		counter1++;
	}
	void display() {
		System.out.println("Counter: "+counter);
		System.out.println("Counter1(Static makes use of same memory): "+counter1);
	}
	
}
