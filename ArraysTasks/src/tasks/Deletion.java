package tasks;

public class Deletion {
	public static void main(String[] args) {
		int[] Bess = {9,12,8,21,30,16,49,12};
		int n=7;
		int del=1;
		for(int i = del -1; i < n; i++) {
			Bess[i]=Bess[i+1];
			System.out.println(Bess[i]+" ");
		}
		n--;
		
		
	}

}
