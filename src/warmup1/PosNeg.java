package warmup1;

public class PosNeg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PostiveNegative pn=new PostiveNegative();
		System.out.println(pn.posneg(1, -1, false));
		System.out.println(pn.posneg(-1, 1, false));
		System.out.println(pn.posneg(-4, -5, true));
	}

}
class PostiveNegative{
	boolean posneg(int a, int b, boolean negative) {
		if(negative) {
			return (a<0 && b<0);
		}
		return (a<0 && b>0)||(a>0 && b<0);
	}
}