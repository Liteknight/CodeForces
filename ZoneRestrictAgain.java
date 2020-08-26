import java.util.Scanner;

public class ZoneRestrictAgain {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), h = in.nextInt(), m = in.nextInt(), a[] = new int[n], i, s = 0;

		for (i = 0; i < n; i++)
			a[i] = h;
		
		for (i = 0; i < m; i++) {
			int l = in.nextInt(), r = in.nextInt(), x = in.nextInt(), j;
			
			for (j = l - 1; j < r; j++) {
				a[j] = Math.min(a[j], x);
			}
		}
		in.close();
		for (int z : a)
			s += Math.pow(z, 2);
		
		System.out.println(s);
	}
}
