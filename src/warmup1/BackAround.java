package warmup1;

public class BackAround {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Back b=new Back();
		System.out.println(b.backAround("cat"));
		System.out.println(b.backAround("Hello"));
		System.out.println(b.backAround("a"));
	}

}
class Back{
	String backAround(String str) {
		  String back;
		  back=str.charAt(str.length()-1)+str+str.charAt(str.length()-1);
		  return back;
		}
}