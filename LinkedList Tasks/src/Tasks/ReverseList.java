package Tasks;

import java.util.List;
import java.util.Collections;
import java.util.LinkedList;

public class ReverseList {
	public static void main(String[] args) {
		
		List<Integer> lis=new LinkedList();
		lis.add(-10);
		lis.add(-8);
		lis.add(-6);
		lis.add(-4);
		lis.add(-2);
		lis.add(0);
		lis.add(2);
		lis.add(4);
		lis.add(6);
		lis.add(8);
		lis.add(10);
		
		System.out.println("list be like: "+lis);
		
		Collections.reverse(lis);
		System.out.println("list be like after reversal: "+lis);
		
		
	}

}
