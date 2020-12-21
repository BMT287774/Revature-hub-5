package tasks;

import java.util.Arrays;

public class MinandMax {
	public static void main(String[] args) {
		int[] Corrin = {-3,12,-2,3,0,-100,14,80,-9,11};
		Arrays.sort(Corrin);
		System.out.println("Minimum Value is : "+ Corrin[0]);
		System.out.println("Maximum Value is : "+ Corrin[Corrin.length -1]);
		
		
	}

}
