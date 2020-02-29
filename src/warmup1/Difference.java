package warmup1;

public class Difference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Diff d=new Diff();
		System.out.println(d.diff21(19));
		System.out.println(d.diff21(10));
		System.out.println(d.diff21(21));
	}

}
class Diff{
	int diff21(int n) {
		if(n<=21){
		    return 21-n;
		  }
		  return 2*(n-21);
	}
}