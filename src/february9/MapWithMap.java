package february9;
import java.util.*;
public class MapWithMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, HashMap<Integer,ArrayList<String>>> map=new HashMap<>();
		
		
		
		ArrayList<String> list1= new ArrayList<>();
		list1.add("Amol");
		list1.add("Developer");
		list1.add("Java");
		
		ArrayList<String> list2= new ArrayList<>();
		list2.add("Jyoti");
		list2.add("Developer");
		list2.add(".Net");
		
		ArrayList<String> list3= new ArrayList<>();
		list3.add("Shanti");
		list3.add("Tester");
		list3.add("Manual");
		
		HashMap<Integer,ArrayList<String>> details1=new HashMap<>();
		HashMap<Integer,ArrayList<String>> details2=new HashMap<>();
		HashMap<Integer,ArrayList<String>> details3=new HashMap<>();
		details1.put(1001,list1);
		details2.put(1002, list2);
		details3.put(1003,list3);
		
		map.put("Finance", details1);
		map.put("Investment", details2);
		map.put("Asset Management", details3);
		
		System.out.println(map);
		System.out.println(map.get("Investment").get(1002).get(0));
		
		
			for (String value : map.keySet()) {
				System.out.println(value +"--"+ map.get(value));
			}
		
		
	}

}
