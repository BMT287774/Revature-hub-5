package Tasks;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListMinandMax {
	
	public static void main(String[] args) {
		
		List<Integer> lis=new LinkedList();
		lis.add(-8);
		lis.add(14);
		lis.add(-49);
		lis.add(30);
		lis.add(-4);
		lis.add(6);
		lis.add(-23);
		lis.add(1000);
		lis.add(21);
		
		System.out.println("list be like: "+lis);
		
		Collections.sort(lis);
		System.out.println("Minimum Value is: "+lis.get(0));
		System.out.println("Maximum Value is: "+lis.get(8));
	}

}
