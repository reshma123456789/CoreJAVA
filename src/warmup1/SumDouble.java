package warmup1;

public class SumDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoubleSum d=new DoubleSum();
		System.out.println(d.doubleSum(1, 2));
		System.out.println(d.doubleSum(3, 2));
		System.out.println(d.doubleSum(2, 2));
	}

}
 class DoubleSum{
	 int doubleSum(int a, int b) {
		 if(a==b){
			    return 2*(a+b);
			  }
			  return a+b;
	 }
 }