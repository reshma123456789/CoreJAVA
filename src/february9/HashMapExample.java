package february9;

import java.util.HashMap;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> map=new HashMap<>();
		map.put("Pune",411014);
		map.put("Mumbai",410014);
		map.put("Gujrat",411123);
		System.out.println(map);
		System.out.println(map.keySet());//keyset returns set of strings(because here key is taken as string) -unique
		System.out.println(map.values());
		System.out.println(map.size());
		
		map.replace("Mumbai",412214);
		System.out.println(map);
		
		map.remove("Mumbai");
		System.out.println(map);
		
		System.out.println(map.containsKey("Nasik"));
		System.out.println(map.containsValue(431001));
		
		System.out.println(map.get("Punee"));
		
		//Duplicate key used then it replaces the value
		map.put("Gujrat",123445);
		System.out.println(map);
		
		
		for (String key : map.keySet()) {
			System.out.println("Key= "+ key+"  "+"value = "+map.get(key));
			
		}
	}

}
