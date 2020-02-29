package warmup1;

public class Make10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sum s=new Sum();
		System.out.println(s.makes10(9, 10));
		System.out.println(s.makes10(9, 9));
		System.out.println(s.makes10(1, 9));
	}

}
class Sum{
	boolean makes10(int a, int b) {
		return (a==10 || b==10 || a+b==10);
	}
}