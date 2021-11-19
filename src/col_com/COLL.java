package col_com;

import java.util.ArrayList;
import java.util.List;

public class COLL {

	public static void main(String[] args) {

		List<Integer> R = new ArrayList<Integer>();

		R.add(100);
		R.add(200);
		R.add(300);
		R.add(400);
		R.add(500);
		R.add(600);
		R.add(700);
		R.add(800);

		System.out.println("-----wrapper class-----");
		System.out.println(R);

		int size = R.size();
		System.out.println(R.size());

		System.out.println(R.get(2));

		System.out.println(R.set(4, 1000));
		System.out.println(R);

		System.out.println(R.remove(7));
		System.out.println(R);

		System.out.println(R.indexOf(0));
		System.out.println(R.contains(100));
		System.out.println(R.contains(30));

	}

}
