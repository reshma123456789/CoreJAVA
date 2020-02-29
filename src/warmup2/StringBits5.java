package warmup2;

public class StringBits5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBits s=new StringBits();
		System.out.println(s.stringBits("Hello"));
		System.out.println(s.stringBits("Hi"));
		System.out.println(s.stringBits("Heeololeo"));
	}

}
class StringBits{
	String stringBits(String str) {
		  String temp="";
		  int i=0;
		  while(i<=str.length()-1){
		    temp+=str.charAt(i);
		    i+= 2;
		  }
		  return temp;
		}

}