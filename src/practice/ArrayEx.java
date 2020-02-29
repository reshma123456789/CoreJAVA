package practice;

import java.util.ArrayList;

public class ArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<ArrayList<String>>> list=new ArrayList<>();
		
		ArrayList<String> list1a=new ArrayList<>();
		ArrayList<String> list1b=new ArrayList<>();
		list1a.add("chennai");
		list1a.add("Patna");
		
		list1b.add("kolkata");
		list1b.add("Pune");
		list1b.add("mumbai");
		
		ArrayList<ArrayList<String>> list1=new ArrayList<>();
		ArrayList<ArrayList<String>> list2=new ArrayList<>();
		list1.add(list1a);
		list2.add(list1b);
		
		list.add(list1);
		list.add(list2);
		
		System.out.println(list);
		
	}

}
