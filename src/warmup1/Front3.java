package warmup1;

public class Front3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Front f=new Front();
		System.out.println(f.front3("Java"));
		System.out.println(f.front3("Chocolate"));
		System.out.println(f.front3("abc"));
	}

}
class Front{
	String front3(String str) {
		  if(str.length()<3){
		    return str+str+str;
		  }
		  
		  String sub=str.substring(0,3);
		  return sub+sub+sub;
		}
}