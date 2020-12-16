package Assign;

public class palindrome {
	public static void main(String[] args) {
		String name = "moon";
		name.toLowerCase();
		StringBuilder s = new StringBuilder(name); //make object of the string name
		StringBuilder c = new StringBuilder(name);//make object to use reverse method on
		c = c.reverse(); //use reverse method 
		System.out.println(s);
		System.out.println(c);
		
		if(s.toString().equals(c.toString())) { //if/else statement used in order to see if both strings put up the same values.
			System.out.println("This is a palindrome");
		}else {
			System.out.println("this is not a palindrome");
		}
		
			
		
				
	}

}
