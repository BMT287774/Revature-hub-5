package tasks;

public class ReverseCard {
	
	public static void main(String[] args) {
		int []rev = {-8,-3,2,7,12,17};
		reverse(rev, rev.length);
	}
	static void reverse (int []x, int n) {
		int [] y=new int [n];
		int z=n;
		int i;
		for(i = 0; i < n; i++) {
			y[z-1] = x[i];
			z = z-1;
			
		}
		System.out.println("the array is now : /n");
		int w;
		for(w = 0; w < n; w++) {
			System.out.println(y[w]);
		}
		
		
		
	}
	

}
