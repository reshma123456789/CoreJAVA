package warmup1;

public class HasTeen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teen t=new Teen();
		System.out.println(t.hasTeen(13, 20, 10));
		System.out.println(t.hasTeen(20, 19, 10));
		System.out.println(t.hasTeen(20, 10, 13));
	}

}
class Teen{
	 boolean hasTeen(int a, int b, int c) {
		  return (a>=13 && a<=19) || (b>=13 && b<=19) || (c>=13 && c<=19);
		}
}