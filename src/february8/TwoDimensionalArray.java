package february8;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] num= {{1,2,3,4},{5,6,7}};
		System.out.println(num.length);//Length of array
		
		System.out.println("//////////");
		for(int i=0;i<num.length;i++) {
			
			for(int j=0;j<num[i].length;j++) {
				
				System.out.print(num[i][j]+" ");
			}
			System.out.println();
		}
	}

}
