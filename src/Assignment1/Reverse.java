package Assignment1;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1234, rem,reverse=0;
		int org=n;
		while(n!=0) {
			rem=n%10;
			reverse=(reverse*10)+rem;
			n=n/10;
			
		}
		System.out.println("Reverse of "+org+" is "+reverse);

	}

}
