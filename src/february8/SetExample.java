package february8;
import java.util.*;
public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> set=new HashSet<>();
		set.add("Karnataka");
		set.add("Maharashtra");
		set.add("Telangana");
		set.add("Gujrat");
		set.add("Telangana");
		set.add("Maharashtra");
		set.add(null);
		set.add(null);
		
		//doesnot retains order
		//Accepts only one null value
		//Duplicates values are removed
		
		System.out.println(set);
		
		//for each used in list and set
		for (String s : set) {
			System.out.println(s);
		}
	}

}
