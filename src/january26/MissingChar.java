package january26;

public class MissingChar {

	public String missingChar(String str, int n) {
	
	String res="";
	String front=str.substring(0,n);
	String back=str.substring(n+1);
	return res=front+back;
	}
}
