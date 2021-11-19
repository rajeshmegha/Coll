package col_com;

import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;

class MA1 {


	public static void main(String[] args) {
		HashMap<Integer,String> h = new HashMap<Integer,String>();
		
		h.put(603103," kelambakkam");
		h.put(600015," saidapet");
		h.put(600001,"parrys");
		h.put(600014,"teynampet");
		h.put(600015,"saidapet");
		
		System.out.println("hashset values  "+h);
		
		System.out.println(h.containsKey(600015));
		System.out.println(h.containsValue("porur"));
		System.out.println(h.containsValue("parrys"));
		System.out.println("clone value or another copy  "+h.clone());
		
		
		HashMap<Integer,String> h1 = new HashMap<Integer,String>();
		h1.putAll(h);
		System.out.println(h1);
		
		h1.clear();
		System.out.println(h1);
		
		System.out.println(h.containsKey(600001));
		System.out.println(h.containsValue("porur"));
		System.out.println(h.keySet());
		System.out.println(h.get(600015));
		System.out.println(h.values());
		System.out.println(h.entrySet());
		
	
		
	
}		
		
		
		
	}


