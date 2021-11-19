package col_com;

import java.util.LinkedList;
import java.util.ListIterator;

public class Iterator {

	public static void main(String[] args) {
		
		LinkedList<String> raj = new LinkedList<String>();
		
		raj.add("Audi");
		raj.add("BMW");
		raj.add("KIA");
		raj.add("CHEVORLET");
		raj.add("FORD");
		
		ListIterator<String>  R1 = raj.listIterator();
		
		while (R1.hasNext()) {
        System.out.println("Example for iterator   "+R1.next());	
        System.out.println("\n");
		}
		
		
	System.out.println("====REVERSE ORDER=====");
	System.out.println("\n");
		
		while (R1.hasPrevious()) {
	        System.out.println("Example for iterator   "+R1.previous());	
	        System.out.println("\n");
		
	}

}
}
