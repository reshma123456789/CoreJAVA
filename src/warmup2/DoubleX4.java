package warmup2;

public class DoubleX4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoubleX d=new DoubleX();
		System.out.println(d.doubleX("axxbb"));
		System.out.println(d.doubleX("axaxax"));
		System.out.println(d.doubleX("xxxxx"));
	}

}
class DoubleX{
	boolean doubleX(String str) {
		  int in=str.indexOf("x");
		  boolean value=false;
		  for(int i=0;i<str.length()-1;i++){
		    if (str.charAt(i)=='x'){
		    if(str.charAt(i)=='x' && str.charAt(i+1)=='x'){
		      value=true;
		    }
		    if(!(str.charAt(i)=='x' && str.charAt(i+1)=='x')){
		      break;
		    }
		  }}
		  return value;
		}

}