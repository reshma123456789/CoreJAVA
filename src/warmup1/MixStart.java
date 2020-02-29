package warmup1;

public class MixStart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mix m= new Mix();
		System.out.println(m.mixStart("mix snacks"));
		System.out.println(m.mixStart("pix snacks"));
		System.out.println(m.mixStart("piz snacks"));
	}

}
class Mix{
	boolean mixStart(String str) {
		  if (str.length()>=3){
		  return (str.substring(1,3).equals("ix"));
		  }
		  return false;
		}
}
