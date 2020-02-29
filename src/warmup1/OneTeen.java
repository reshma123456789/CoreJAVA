package warmup1;

public class OneTeen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		One o=new One();
		System.out.println(o.loneTeen(13, 99));
         System.out.println(o.loneTeen(21, 19));
         System.out.println(o.loneTeen(13, 13));
	}

}
class One{
	boolean loneTeen(int a, int b) {
		  return ((a>=13 && a<=19)&& !(b>=13 && b<=19))||(!(a>=13 && a<=19)&&(b>=13 && b<=19));
		}

}