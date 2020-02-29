package january25;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the table");
		int n=scn.nextInt();
		for(int i=1;i<=10;i++) {
			int j=n*i;
			System.out.println(n+" * "+i+" = "+j);
		}
	}

}
