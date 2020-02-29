package warmup1;

public class NotString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Not n=new Not();
		System.out.println(n.notString("candy"));
		System.out.println(n.notString("x"));
		System.out.println(n.notString("not bad"));
		
	}

}
class Not{
	String notString(String str) {
		if(str.length() >= 3 && str.substring(0,3).equals("not")){//instead of substring we can use startswith
		    return str;
		  }
		  return "not "+str;
	}
}