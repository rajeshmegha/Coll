package col_com;

public class TYPES_OF_EXCEP {

	public static void main(String[] args) {
		
	int a[] =  new int[7];
	
	
	a[1] = 78;
	a[5] =56;
	System.out.println(a.equals(a));
	
	try {
		System.out.println("hi rajesh");
		a[9]= 89;
		
		
	} 
catch (IndexOutOfBoundsException e) {
 System.out.println("welcome");}
	catch (Exception e) {
		System.out.println("i have caught the error");
	System.out.println("anyway run codes");
}
}
}