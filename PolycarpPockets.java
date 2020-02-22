
import java.util.Scanner;
import java.util.Arrays;

public class PolycarpPockets {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt(), i, numCount=0, pockets=1;
		int[] a = new int[n];
		
		for (i=0; i<n; i++) {
			a[i] = in.nextInt();
		}
		Arrays.sort(a);
		
		for (i=0; i<n-1; i++) {
			
			if (a[i] == a[i+1]) {
				numCount++;				
				if (numCount > pockets-1) { pockets++; }
				
			} else {
				numCount = 0;
			}
		}
		System.out.println(pockets);
		in.close();
	}
}
