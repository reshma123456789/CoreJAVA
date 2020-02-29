package Assignment1;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=2;
		int p=0;
		while(p<100) {
			int count=0;
			for(int i=2;i<num;i++) {
				if(num%i==0) {
					count++;
					break;
				}
			}
			if(count==0) {
				System.out.println(num);
				p++;
			}
			num++;
		}
	}

}
