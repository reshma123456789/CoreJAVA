package warmup1;

public class FrontBack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FrontToBack fb=new FrontToBack();
		System.out.println(fb.frontBack("code"));
		System.out.println(fb.frontBack("a"));
		System.out.println(fb.frontBack("ab"));
	}

}
class FrontToBack{
	String frontBack(String str) {
		 String full="";
		  if(str.length()<=1){
		    full=str;
		  }
		  else{
		  String mid=str.substring(1,str.length()-1);
		  full=str.charAt(str.length()-1)+mid+str.charAt(0);
		  }
		  return full;
	}
}