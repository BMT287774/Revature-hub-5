package Assign;

public class oddnumbers {
	
	public static void main(String[] args) {
		int n = 50; //make range of numbers
		int i; //initialize i
		
		for(i = 1; i<=n; i++) { //make for loop to set numbers 1 through 50
			if (i % 2 != 0) { //only set numbers that do not have a remainder of 0 when divided by 2
				System.out.println(i+" ");
			}
			
		}
		
	}

}
