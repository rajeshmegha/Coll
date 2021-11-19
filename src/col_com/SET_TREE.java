package col_com;

import java.util.Iterator;
import java.util.TreeSet;

public class SET_TREE {

	public static void main(String[] args) {
		
		TreeSet<Integer> ts = new TreeSet<Integer>();
		
		ts.add(100);
		ts.add(20);
		ts.add(30);
		ts.add(70);
		ts.add(10);
		ts.add(60);
		ts.add(15);
		
		System.out.println("printed in ascending order");
		System.out.println("------------------------");
		
		System.out.println(ts);
		System.out.println(ts.size());
		System.out.println("size of the element  "+ ts.size());
		
		ts.first();
		System.out.println("first tree set element  "+ts.first());
		
		ts.last();
		System.out.println("last tree set   "+ts.last());
		
		ts.headSet(70);
		System.out.println("give u the next lesser element   than 70   "+ts.headSet(70));
		
		ts.tailSet(15);
		System.out.println("gives u the previous higher element than 15   "+ts.tailSet(15));
		
		ts.subSet(20,60);
		System.out.println("prints the between elemente as mentioned  "+ts.subSet(20,60));
		
		ts.higher(60);
		System.out.println("prints the next higher element  "+ts.higher(60));
		
		ts.lower(20);
		System.out.println("prints the previous lower element  "+ts.lower(20));
		System.out.println(ts);
		
		ts.pollFirst();
		ts.pollLast();
		System.out.println("Retrive and delete the FIRST element   "+ts);
		System.out.println("Retrive and delete the LAST  element   "+ts);
		
		System.out.println("FINALLY PRINTED ELEMENT   "+ts);
		System.out.println("\n");
		
		System.out.println("----------USING  ITERATOR----------------"); 
		
		Iterator<Integer> ricky = ts.iterator();
		while (ricky.hasNext()) {
			System.out.println("THE ELEMWNTS R OBTAINED ACCORDING TO TREESET PROPS  "+ricky.next());
			System.out.println("\n");
			
		}
			
		}
		 
		
	

		
		
		
		
 
	}


