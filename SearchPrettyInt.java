import java.util.Arrays;
import java.util.Scanner;

public class SearchPrettyInt {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), m = in.nextInt(), i, j, a[] = new int[n], b[] = new int[m];

		for (i = 0; i < n; i++)
			a[i] = in.nextInt();
		for (i = 0; i < m; i++)
			b[i] = in.nextInt();
		
		in.close();
		Arrays.sort(a);
		Arrays.sort(b);
		
		for (i = 0; i < n; i++)
			for (j = 0; j < m; j++)
				
				if (a[i] == b[j]) {
					System.out.println(a[i]);
					return;
				}
		System.out.println(Math.min(a[0], b[0]) + "" + Math.max(a[0], b[0]));
	}
}
