package january18;

public class CalculatorAssignment {
	int x;
	int y;
	
	CalculatorAssignment(int x, int y){
		this.x=x;
		this.y=y;
		
	}

	void add() {
		System.out.println("Addition: "+(x+y));
		
	}
	void sub() {
		System.out.println("Subtraction: "+(x-y));
		
	}
	void mul() {
		System.out.println("Multiplication: "+(y*x));
	}
	void div() {
		System.out.println("Division: "+(y/x));
	}
}
