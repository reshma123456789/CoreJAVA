package january18;

public class StaticInstanceVariableExe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticInstanceVariable obj=new StaticInstanceVariable();
		obj.display();//before incrementing
		obj.increment();
		obj.display();//after incrementing
		
		StaticInstanceVariable obj1=new StaticInstanceVariable();
		obj1.display();
		obj1.increment();
		obj1.display();
		
	}

}
