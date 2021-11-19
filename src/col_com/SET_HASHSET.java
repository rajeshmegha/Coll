package col_com;

import java.util.HashSet;
import java.util.Iterator;

public class SET_HASHSET {

	public static void main(String[] args) {

		HashSet<String> h1 = new HashSet<String>();
		h1.add("RHIYA");
		h1.add("THARUN");
		h1.add("YUGAN");
		h1.add("KAVEESH");
		h1.add("DHAKSHAN");
		h1.add("MEGHA");
		h1.add("MAARAN");
		h1.add("MAARAN");
		h1.add(null);
		
		//no insertion order is maintained
		//does not allow duplicate elements;

		System.out.println(h1);

		System.out.println(h1.size());
		System.out.println(h1.contains("THARUN"));
		System.out.println(h1.isEmpty());
		System.out.println(h1.remove("YUGAN"));
		System.out.println(h1);
		System.out.println(h1.equals(h1));

		HashSet<String> h2 = new HashSet<String>();

		h2.addAll(h1);
		System.out.println(h2);

		h2.add("BMW");
		h2.add("maruthi");
		System.out.println(h2);

		System.out.println(h2.equals(h1));

		Iterator<String> ricky = h2.iterator();
		
		System.out.println("------hashset-----");

		while (ricky.hasNext()) {
			System.out.println("THE unique HEROS   " + ricky.next());
			System.out.println("\n");
		}

	}

}
