package Assignment1;

public class Palindrome {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=129;
		
	int rev=0;
	int rem;
	int org=n;
		while(org!=0) {
			rem=n%10;
			rev=(rev*10)+rem;
			n=n/10;
		}
		if(org==rev) {
			System.out.println(org+" - Given number is palindrome");
		}
		else {
			System.out.println(org+" - Not a palindrome");
		}
	
	}
	

}
