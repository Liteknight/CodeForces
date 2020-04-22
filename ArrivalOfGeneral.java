import java.util.Scanner;

public class ArrivalOfGeneral {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i, maxv = 0, maxi = 0, minv = 100, mini = 0;
		int[] a = new int[n];

		for (i = 0; i < n; i++) {
			int ai = in.nextInt();
			a[i] = ai;

			if (ai > maxv) {
				maxv = ai;
				maxi = i;
			}
			if (ai <= minv) {
				minv = ai;
				mini = i;
			}
		}		
		int c = n - mini + maxi - 1;
		if (mini < maxi) {
			c--;
		}
		System.out.println(c);
		in.close();	
	}
}
