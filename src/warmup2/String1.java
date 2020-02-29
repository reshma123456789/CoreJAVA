package warmup2;

public class String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTimes s=new StringTimes();
		System.out.println(s.stringTimes("Hi", 2));
		System.out.println(s.stringTimes("Hi", 3));
		System.out.println(s.stringTimes("Hi", 1));
	}

}
class StringTimes{
	String stringTimes(String str, int n) {
		  String temp="";
		  for(int i=0;i<n;i++){
		    temp+=str;
		  }
		  return temp;
		}
}