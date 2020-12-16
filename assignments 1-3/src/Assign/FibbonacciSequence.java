package Assign;

public class FibbonacciSequence {
	public static void main(String[] args) {
		int fib = 12;
		int step1 = 0;
		int step2 = 1;
		//use line 4 as the range, and lines 6 and 7 to get the first two steps of 
		//the sequence
		
		for(int i = 1; i <= fib; i++) {
			System.out.println(step1+" ");
			int sum = step1 + step2;
			step1 =  step2;
			step2 = sum;
			
			// on each iteration, it assigns the second step as the first and the sum of the two steps as the second step
			
		}
		
				
				
	}
	
				
				
		
	}

	

