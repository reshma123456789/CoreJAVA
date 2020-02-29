package warmup1;

public class In3050 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		In n=new In();
		System.out.println(n.in3050(30, 31));
		System.out.println(n.in3050(30, 41));
		System.out.println(n.in3050(40, 50));
	}

}
class In{
	boolean in3050(int a, int b) {
		  return(((a>=30 && a<=40)&&
		    (b>=30 && b<=40))||
		    ((a>=40 && a<=50)&&
		    (b>=40 && b<=50)));
		}
}