package warmup1;

public class Close10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Close c=new Close();
		System.out.println(c.close10(8, 14));
		System.out.println(c.close10(13, 8));
		System.out.println(c.close10(13, 7));
	}

}
class Close{
	int close10(int a, int b) {
		  int aDiff = Math.abs(a - 10); //Math.abs gives only positive value
		  int bDiff = Math.abs(b - 10);
		  if(aDiff<bDiff) {
			  return a;
		  }
		  else if(aDiff>bDiff) {
			  return b; 
		  }
		  return 0;
}
}