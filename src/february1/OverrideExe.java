package february1;

// If you want to change implementation of method from the parent class in child class we use overriding
//overriding where there is [IS-A] relationship (inheritence)
//Which method to be called is decided at runtime
public class OverrideExe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b=new B();
		b.add(10,20);
		b.div(20,10);
		
		 A a=new A();
		 a.add(10, 20);
	}

}
