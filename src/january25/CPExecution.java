package january25;

import java.util.Scanner;

public class CPExecution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckPalindrome cp=new CheckPalindrome();
		cp.check();
		System.out.println("Do you want to continue yes/no");
		Scanner scn=new Scanner(System.in);
		String res="yes";
		String ans=scn.nextLine();
		while(ans.equals(res)) {
			cp.check();
			System.out.println("Do you want to continue yes/no");
			 ans=scn.nextLine();
		}
	}

}
