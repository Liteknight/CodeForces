import java.util.Scanner;

public class Marks {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), m = in.nextInt(), i, j, y = 0;
		String a[] = new String[n];
		for (i = 0; i < n; i++)
			a[i] = in.next();

		in.close();
		boolean b[] = new boolean[n];
		for (i = 0; i < m; i++) {
			
			int c = 0;
			for (j = 0; j < n; j++)
				c = Math.max(c, a[j].charAt(i));
			
			for (j = 0; j < n; j++) {
				if (a[j].charAt(i) == c)
					b[j] = true;
			}
		}
		for (boolean x : b)
			if (x)
				y++;
		System.out.println(y);
	}
}
