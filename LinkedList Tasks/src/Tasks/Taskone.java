package Tasks;

import java.util.LinkedList;
import java.util.List;

public class Taskone {
	
	public static void main(String[] args) {
		
		List lis=new LinkedList();
		lis.add(17);
		lis.add(69);
		lis.add(null);
		lis.add(21345);
		lis.add("Hot Dogs are Sandwiches");
		lis.add("Chicken came before the egg");
		lis.add(13000.23345);
		System.out.println("lis = "+lis);
		lis.add(0, "Dog Buns");
		System.out.println("lis after dog buns = "+lis);
		lis.remove(4);
		System.out.println("lis.remove(4) = "+lis);
		
		
		List<Integer> lis2=new LinkedList<>();
		lis2.add(200);
		lis2.add(34561);
		lis2.add(1230098);
		lis2.add(12874668);
		System.out.println("lis2 = "+lis2);
		
		List<Double> lis3=new LinkedList<>();
		lis3.add(22.9987);
		lis3.add(203938.22030994);
		lis3.add(3456.00003992);
		System.out.println("lis3 =  "+lis3);
		
		
	}

}
