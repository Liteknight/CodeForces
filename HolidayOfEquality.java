import java.util.Scanner;

public class HolidayOfEquality {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(), j, max=0, b=0;
		int[] a = new int[n];
		
		for (j=0; j<n; j++) {
			
			a[j] = sc.nextInt();
			
			if (a[j] > max) max = a[j];
		}
		for (j=0; j<n; j++) {
			
			b += (max - a[j]);
		}

		System.out.println(b);
		sc.close();
	}
}