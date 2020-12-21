package Tasks;

import java.awt.List;
import java.util.LinkedList;

public class RemovalTask {
	
	public static void main(String[] args) {
		
		LinkedList<Integer> ls=new LinkedList();
		ls.add(20);
		ls.add(30);
		ls.add(27);
		ls.add(41);
		ls.add(42);
		ls.add(42);
		System.out.println("list be like: "+ls);
		
		int b = 3;
		ls.remove(b);
		System.out.println("list after specific deletion be like: "+ls);
		
		
		
		
		
		
	}

}
