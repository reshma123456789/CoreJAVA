package february8;

public class ArrayDeclaration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num= new int[4]; //Size of array
		//Array doesnot shrink in size, so if you want to delete or add in array create a new array
		int[] newNum= new int[3];
		int index=2;
		int j=0;
		
		num[0]=1;
		num[1]=10;
		num[2]=100;
		num[3]=1000;
		for(int i=0;i<num.length;i++) {
			System.out.println(num[i]);
		}
		System.out.println();
		
		for(int i=0;i<num.length;i++) {
			if(index==i) {
				continue;
			}
			newNum[j]=num[i];
			j++;
		}	
		for(int i=0;i<newNum.length;i++) {
			System.out.println(newNum[i]);
		}
	}

}
