package collections;

import java.util.*;
public class hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1, "Tim");
		hm.put(2, "Mohit");
		hm.put(3, "Ramya");
		hm.put(4, "Saurav");
		
		System.out.println("\nThe elements of the HashMap are:");
		System.out.println(hm);
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		
		for(Map.Entry< Integer, String > m :hm.entrySet()) {
			System.out.println(m.getKey()+"   "+m.getValue());
			
		}
		System.out.println(hm.get(3));
		
		
	}

}