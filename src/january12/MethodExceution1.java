package january12;

public class MethodExceution1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodExample1 obj=new MethodExample1();
		obj.display("Pune");
		obj.display("MH");
		System.out.println("----------------------");
		
		obj.add(10, 20);
		int result=obj.add(10,20);
		System.out.println(result);
	}

}
