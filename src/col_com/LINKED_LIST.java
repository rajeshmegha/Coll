package col_com;

import java.util.Iterator;
import java.util.LinkedList;

public class LINKED_LIST {

	public static void main(String[] args) {
		
		LinkedList<Integer> ll= new LinkedList<Integer>();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(50);
		
		System.out.println(ll);
		
		ll.size();
		System.out.println(ll.size());

		ll.addFirst(75);
		System.out.println("Added Element   "+ll);
		ll.addLast(90);
		System.out.println("Added last    "+ll);
		
		ll.removeFirstOccurrence(10);
		System.out.println("Deleting first  "+ll);
		
		ll.removeLastOccurrence(50);
		System.out.println("Deleting last"  +ll);
		
		ll.remove(3);
        System.out.println("deleting via index based   "+ll);
        
        ll.poll();
         System.out.println(ll);
         
         ll.pollLast();
         System.out.println(ll);
         
          for (Integer integer : ll) {
        	 System.out.println(integer);
			
		}
         
		}
         
}
        
        
		
		
		

	


