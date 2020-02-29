package january19;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int day=9;
		
		switch(day) {
		case 1: System.out.println("First day of the week Sunday");
		break;
		case 2: System.out.println("Second day of the week Monday");
		break;
		case 3: System.out.println("Third day of the week Tuesday");
		break;
		case 4: System.out.println("Fourth day of the week Wednesday");
		break;
		case 5: System.out.println("Fiftht day of the week Thursday");
		break;
		case 6: System.out.println("Sixth day of the week Friday");
		break;
		case 7: System.out.println("Seventh day of the week Saturday");
		break;
		default: System.out.println("Invalid number");
		
		}
		System.out.println("Outside Switch");
	}

}
