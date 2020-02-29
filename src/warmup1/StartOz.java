package warmup1;

public class StartOz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Start11 s=new Start11();
		System.out.println(s.startOz("ozymandias"));
		System.out.println(s.startOz("bzoo"));
		System.out.println(s.startOz("oxx"));
	}

}
class Start11{
	String startOz(String str) {
		  String result="";
		  if (str.length() >= 1 && str.charAt(0)=='o') {// charaAt takes single character so ''
		    result = result + str.charAt(0);
		  }
		  
		  if (str.length() >= 2 && str.charAt(1)=='z') {
		    result = result + str.charAt(1);
		  }
		  
		  return result;
		  }
}