package warmup1;

public class LastDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Last l= new Last();
		System.out.println(l.lastDigit(7, 17));
		System.out.println(l.lastDigit(6, 17));
		System.out.println(l.lastDigit(3, 113));
	}

}
class Last{
	boolean lastDigit(int a, int b) {
		  return (a%10==b%10);
		}
}