package january19;

public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10,b=20,c=30;
		if(b>a) {
			System.out.println("b is greater than a");
			if(c>a) {
				System.out.println("c is greater than a");
			}
		}
		
		System.out.println();
		if(a>c) {
			System.out.println("a is greater than c");
		}
		else
		{
			System.out.println("c is greater tan a");
		}
	}

}
