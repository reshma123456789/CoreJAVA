package warmup1;

public class Parrot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParrotTrouble p=new ParrotTrouble();
		System.out.println(p.parrotTrouble(true, 6));
		System.out.println(p.parrotTrouble(true, 7));
		System.out.println(p.parrotTrouble(false, 6));
	}

}
class ParrotTrouble{
	boolean parrotTrouble(boolean talking,int hour) {
		if(talking && (hour<7 || hour>20)){
		    return true;
		  }
		  return false;
	}
}