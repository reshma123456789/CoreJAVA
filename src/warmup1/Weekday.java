package warmup1;

public class Weekday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SleepIn s=new SleepIn();
		System.out.println(s.sleepIn(false,false));
		System.out.println(s.sleepIn(true,false));
		System.out.println(s.sleepIn(false,true));
	}
}
 class SleepIn{
		
		public boolean sleepIn(boolean weekday, boolean vacation) {
			// TODO Auto-generated method stub
			
				if(!weekday || vacation) {
					return true;
			}
			return false;
			}

		}


