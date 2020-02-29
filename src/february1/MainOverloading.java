package february1;

public class MainOverloading {
	//Main method can be overloaded but is of no use
	//because jvm searches for the main method which has String[] as argument
	//if there are multiple main method also it doesnot execute

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main method with String[] args");
	}
	public static void main(String[] args,String[] arg) {
		// TODO Auto-generated method stub
		System.out.println("Main method with two String[] args");
	}
	public static void main(String args) {
		// TODO Auto-generated method stub
		System.out.println("Main method with String args");
	}
	public static void main(String[] args,String arg) {
		// TODO Auto-generated method stub
		System.out.println("Main method with String[] args,String");
	}

}
