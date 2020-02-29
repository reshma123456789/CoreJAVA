package warmup1;

public class DelDel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Del d=new Del();
		System.out.println(d.delDel("adelbc"));
		System.out.println(d.delDel("adelHello"));
		System.out.println(d.delDel("adedbc"));
	}

}
class Del{
	String delDel(String str) {
		  if(str.length()>3){
		    if(str.substring(1,4).equals("del")){
		    String front=str.substring(0,1);
		    String back=str.substring(4,str.length());
		    return front+back;
		  }
		  }
		  return str;
		}
}