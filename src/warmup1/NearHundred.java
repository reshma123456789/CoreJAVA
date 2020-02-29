package warmup1;

public class NearHundred {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Near n=new Near();
		System.out.println(n.nearHundred(93));
		System.out.println(n.nearHundred(90));
		System.out.println(n.nearHundred(121));
	}

}
class Near{
	boolean nearHundred(int n) {
		return ((n>=90 && n<=110)||(n>=190 && n<=210));
	}
}