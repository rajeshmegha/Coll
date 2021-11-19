package col_com;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Linkes_hashset {

	public static void main(String[] args) {
		
		LinkedHashSet<Object> lh = new LinkedHashSet<Object>();
		
		lh.add(100);
		lh.add("THARUN");
		lh.add("YUGAN");
		lh.add('m');
		lh.add(90.78);
		lh.add("MEGHA");
		lh.add("MAARAN");
		lh.add(500);
		lh.add(null);
		
		System.out.println(lh);
		
		Iterator<Object> ricky = lh.iterator();
		while (ricky.hasNext()) {
			System.out.println("THE ELEMENTS ARE IN INSERTION ORDER   "+ricky.next());
			System.out.println("\n");
			
		}
		
		
		

	}

}
