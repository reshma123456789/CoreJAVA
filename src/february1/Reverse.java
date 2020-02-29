package february1;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reverse r=new Reverse();
		r.reverseString();
	}
	void reverseString() {
		String temp="";
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=scan.nextLine();
		for(int i=str.length()-1;i>=0;i--) {
			 temp=temp+str.charAt(i);
		}
		System.out.println(temp);
	}
}
 