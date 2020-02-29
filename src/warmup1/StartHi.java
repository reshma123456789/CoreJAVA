package warmup1;

public class StartHi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Start s=new Start();
		System.out.println(s.startHi("hi there"));
		System.out.println(s.startHi("hi"));
		System.out.println(s.startHi("hello hi"));
	}

}
class Start{
	boolean startHi(String str) {
		  if(str.length()>=2){
		    return (str.substring(0,2).equals("hi"));
		  }
		  return false;
		}
}