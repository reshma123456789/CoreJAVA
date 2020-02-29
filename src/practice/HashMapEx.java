package practice;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, ArrayList<String>> map=new HashMap<>();
		
		ArrayList<String> list1=new ArrayList<>();
		list1.add("Bangalore");
		list1.add("Orissa");
		
		ArrayList<String> list2=new ArrayList<>();
		list2.add("Delhi");
		list2.add("Manipur");
		
		map.put("Capital", list1);
		map.put("City", list2);
		System.out.println(map);
		System.out.println(map.get("Capital").get(1));
		
		
	}

}
