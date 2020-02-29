package warmup2;

public class FrontTimes2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FrontTimes f=new FrontTimes();
		System.out.println(f.frontTimes("Chocolate", 2));
		System.out.println(f.frontTimes("Chocolate", 3));
		System.out.println(f.frontTimes("Abc", 3));
	}

}
class FrontTimes{
	String frontTimes(String str, int n) {
		   String temp="";
		  if(str.length()>3){
		   
		  String front=str.substring(0,3);
		  for(int i=0;i<n;i++){
		    temp+=front;
		  }
		  }
		  else{
		    for(int i=0;i<n;i++){
		    temp+=str;
		  }
		  }
		  return temp;
		}

}