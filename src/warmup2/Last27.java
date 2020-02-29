package warmup2;

public class Last27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Last2 l=new Last2();
		System.out.println(l.last2("hixxhi"));
		System.out.println(l.last2("xaxxaxaxx"));
		System.out.println(l.last2("axxxaaxx"));
	}

}
class Last2{
	int last2(String str) {
		  if(str.length()<2){
		    return 0;
		  }
		  String end=str.substring(str.length()-2);
		 // System.out.println(end);
		  int count=0;
		  for(int i=0;i<str.length()-2;i++){
		    if(end.equals(str.substring(i,i+2))){
		      count++;
		    }
		  }
		  return count;
		}

}