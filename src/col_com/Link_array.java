package col_com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Link_array {

	public static void main(String[] args) {
		
		List<Object>  L1 = new ArrayList<Object>();
		
		L1.add(100);
		L1.add(200);
		L1.add(300);
		L1.add(400);
		L1.add(500);
		L1.add(600);
		L1.add(700);
		L1.add(800);
		L1.add(900);
		L1.add("RAJESH");
		L1.add("RHIYA");
		L1.add("BMW");
		
		L1.size();
		System.out.println(L1.size());
		
		System.out.println(L1);
		
		L1.get(3);
		System.out.println(L1.get(3));
		
		L1.contains("RAJESH");
		System.out.println(L1.contains("RAJESH"));
		
		L1.isEmpty();
		System.out.println(L1.isEmpty());
		
		L1.indexOf(500);
		L1.lastIndexOf("BMW");
		L1.indexOf("audi");
		System.out.println(L1.indexOf(500));
		System.out.println(L1.lastIndexOf("BMW"));
		System.out.println(L1.indexOf("audi"));
		
		List<Object>  L2 = new ArrayList<Object>();
		L2.addAll(L1);
		System.out.println(L2);
		
		L2.clear();
		System.out.println(L2);
		
		System.out.println(L1.remove(2));
		System.out.println(L1);
		System.out.println(L1.remove("RAJESH"));
		System.out.println(L1);
		
		System.out.println(L1.set(7,"SUGANYA"));
		System.out.println(L1);
		
		System.out.println(L1.add(null));
		System.out.println(L1);
		
		Iterator<Object> R = L1.iterator();
	    while (R.hasNext()) {
		System.out.println(R.next());
		
	}
	}
}
		



 