package warmup1;

public class EndUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Up u=new Up();
		System.out.println(u.endUp("Hello"));
		System.out.println(u.endUp("hi there"));
		System.out.println(u.endUp("hi"));
	}

}
class Up{
	String endUp(String str) {
		if(str.length()>3){
	        String first=str.substring(0,str.length()-3);
			    String up=str.substring(str.length()-3,str.length());
			    
			    return first+(up.toUpperCase());
			  }
			  return (str.toUpperCase());
}
}