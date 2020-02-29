package warmup1;

public class EveryNth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Every e=new Every();
		System.out.println(e.everyNth("Miracle", 2));
		System.out.println(e.everyNth("abcdefg", 2));
		System.out.println(e.everyNth("abcdefg", 3));
	}

}
class Every{
	String everyNth(String str, int n) {
		String result="";
		for(int i=0;i<str.length();i=i+n) {
			result=result+str.charAt(i);
		}
		return result;
	}
}