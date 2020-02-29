package february9;
import java.util.*;
public class MapWithList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, ArrayList<String>> map=new HashMap<>();
		
		ArrayList<String> list1 =new ArrayList<>();
		list1.add("Amol");
		list1.add("Finance");
		list1.add("Developer");
		list1.add("Java");
		
		map.put(1111, list1);
		System.out.println(map);
		
		ArrayList<String> list2 =new ArrayList<>();
		list2.add("Soumya");
		list2.add("Investment");
		list2.add("Testing");
		list2.add("Selenium");
		
		map.put(2222, list2);
		System.out.println(map);
		
		System.out.println(map.get(1111));
		
		System.out.println(map.get(1111).get(2));
	}

}
