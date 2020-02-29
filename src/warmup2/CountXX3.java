package warmup2;

public class CountXX3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountXX c=new CountXX();
		System.out.println(c.countXX("abcxx"));
		System.out.println(c.countXX("xxx") );
		System.out.println(c.countXX("xxxx") );
	}

}
class CountXX{
	int countXX(String str) {
		  int count=0;
		  for(int i=0;i<str.length()-1;i++){
		    if(str.charAt(i)=='x' && str.charAt(i+1)=='x'){
		      count++;
		    }
		  }
		  return count;
		}

}