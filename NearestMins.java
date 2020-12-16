import java.util.Scanner;

public class NearestMins {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), mv = Integer.MAX_VALUE, i, a[] = new int[n], l = -1, md = Integer.MAX_VALUE;
		for (i = 0; i < n; i++) {

			int x = in.nextInt();
			a[i] = x;
			mv = Math.min(mv, x);
		}
		in.close();
		for (i = 0; i < n; i++)
			if (a[i] == mv)
				
				if (l == -1) {
					l = i;
				} else {
					md = Math.min(md, i - l);
					l = i;
				}
		System.out.println(md);
	}
}
