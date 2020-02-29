package warmup1;

public class Front22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Front1 f=new Front1();
		System.out.println(f.front22("kitten"));
		System.out.println(f.front22("Ha"));
		System.out.println(f.front22("abc"));
	}

}
class Front1{
	String front22(String str) {
		  String full;
		  if(str.length()<=2){
		    full=str+str+str;
		  }
		  else{
		    String first=str.substring(0,2);
		    full=first+str+first;
		  }
		  return full;
}
}