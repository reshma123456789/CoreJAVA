package january25;

import java.util.Scanner;

public class CheckPalindrome {
     void check() {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number");
		int org=scn.nextInt();
		int rev=0;
		int rem;
		int n=org;
			while(n!=0) {
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


