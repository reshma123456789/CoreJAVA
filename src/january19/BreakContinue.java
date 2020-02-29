package january19;

public class BreakContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Example of break");//Takes out of loop
		for(int i=1;i<=10;i++) {
			 if(i==5) {
				 break;
			 }
				 System.out.println(i);
			
		}
		System.out.println("Outside Loop");
		System.out.println();
		System.out.println("Example of continue");//Takes back to the loop
		for(int i=1;i<=10;i++) {
			 if(i==5) {
				 continue;
			 }
				 System.out.println(i);
			
		}
	}

}
