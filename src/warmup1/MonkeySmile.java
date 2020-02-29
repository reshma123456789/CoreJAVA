package warmup1;

public class MonkeySmile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Smile s=new Smile();
				System.out.println(s.monkeyTrouble(true, true));
				System.out.println(s.monkeyTrouble(false, false));
				System.out.println(s.monkeyTrouble(true, false)); 
	}
}

class Smile {
	boolean monkeyTrouble(boolean aSmile,boolean bSmile) {
	if((aSmile && bSmile)||(!aSmile && !bSmile)){
	    return true;
	  }
	  return false;
	}
	
}
	


