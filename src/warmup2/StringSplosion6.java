package warmup2;

public class StringSplosion6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringSplosion s=new StringSplosion();
		System.out.println(s.stringSplosion("Code"));
		System.out.println(s.stringSplosion("abc"));
		System.out.println(s.stringSplosion("ab"));
	}

}
class StringSplosion{
	String stringSplosion(String str) {
		  String temp="";
		  String hold="";
		  for(int i=0;i<=str.length()-1;i++){
		    temp+=str.charAt(i);
		    hold=hold+temp;
		  }
		  return hold;
		}
}