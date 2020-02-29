package february8;
import java.util.*;
public class ArrayListCollection {

	//Array has only 2 inbuilt method
	//whereas ArrayList has multiple methods
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> obj=new ArrayList<>();
		obj.add("Pune");
		obj.add("Chennai");
		obj.add("Aurangabad");
		obj.add("Kolkata");
		obj.add("Mumbai");
		obj.add("Delhi");
		
		System.out.println(obj);
		System.out.println(obj.size());
		System.out.println(obj.contains("Mumbai"));
		System.out.println(obj.indexOf("Pune"));
		System.out.println(obj.get(3));
		List<String> newList=obj.subList(0,3);
		System.out.println(newList);
		obj.remove("Pune");
		System.out.println(obj);
		System.out.println();
		for(int i=0;i<obj.size();i++) {           //used index to get value
			System.out.print(obj.get(i)+" ");
		}
		System.out.println();
		System.out.println("//////////////");
		//advanced for loop
		//used set and list
		for (String value : obj) { // directly values can be fetched 
			System.out.println(value);
			
		}
	}

}
