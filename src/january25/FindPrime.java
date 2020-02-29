package january25;

public class FindPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=5;
		int count=0;
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println(num+" is a prime number");
		}
		else {
			System.out.println(num+" is not a prime number");
		}
	}

}
