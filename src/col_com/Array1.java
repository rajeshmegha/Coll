package col_com;

import java.util.ArrayList;
import java.util.List;


public class Array1 {

	public static void main(String[] args) {

		List<Object> AR = new ArrayList<Object>();

		AR.add(56);
		AR.add(76);
		AR.add(90);
		AR.add(45);
		AR.add(55);
		AR.add("RAJESH");
		AR.add('M');
		AR.add(94.67F);
		AR.add(45);

		int size = AR.size();
		System.out.println(AR.size());
		
		System.out.println(AR);
		System.out.println(AR.get(4));
        
		System.out.println(AR.set(5,"RICKY"));
        System.out.println(AR);
        
        System.out.println(AR.isEmpty());
        System.out.println(AR);
        
        System.out.println(AR.indexOf(55));
        System.out.println(AR.lastIndexOf(94.67F));
        
        System.out.println(AR.remove(3));
        System.out.println(AR);
        
       System.out.println(AR.contains(45));
       System.out.println(AR.contains("RAJESH"));
       
       List<Object> AR1 = new ArrayList<Object>();
       
        AR.add(56);
		AR.add(76);
		AR.add(90);
		AR.add(45);
		AR.add(55);
		AR.add("RAJESH");
		AR.add(94.67F);
		AR.add(45);
		
		AR1.addAll(AR);
		System.out.println(AR1);
		

		AR1.retainAll(AR);
		System.out.println(AR1);
		
		AR1.clear();
		System.out.println(AR);
		
		
		System.out.println("using FOR EACH LOOP to print seperately");
		System.out.println("----------------------------------------");
		
		for (Object object : AR) {
			System.out.println(object);
			
		}
		
	
}			
		}

		
		
		
	
