package february8;
import java.util.*;
public class MultiListCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<ArrayList<Integer>> lists=new ArrayList<>();
		
		ArrayList<Integer> list1=new ArrayList<>();
		ArrayList<Integer> list2=new ArrayList<>();
		ArrayList<Integer> list3=new ArrayList<>();
		
		list1.add(1);
		list1.add(2);
		list1.add(3);
		
		list2.add(4);
		list2.add(5);
		list2.add(6);
		list2.add(7);
		
		list3.add(8);
		list3.add(9);
		list3.add(10);
		list3.add(11);
		
		System.out.println(list1);
		System.out.println(list2);
		System.out.println(list3);
		
		System.out.println(lists);
		lists.add(list1);
		lists.add(list2);
		lists.add(list3);
		System.out.println(lists);
		
		//to fetch particular data
		
		ArrayList<Integer> temp=lists.get(2);
		System.out.println(temp);
		System.out.println(temp.get(2));
		//to fetch in single line
		System.out.println(lists.get(2).get(2));  //because we have perform over whole list
		System.out.println(list2.get(0));
	}

}
