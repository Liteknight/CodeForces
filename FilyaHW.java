import java.util.Arrays;
import java.util.Scanner;

public class FilyaHW {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i, a[] = new int[n], b[] = new int[n], c = 1;
		for (i = 0; i < n; i++)
			a[i] = in.nextInt();
		
		in.close();
		Arrays.sort(a);
		b[0] = a[0];

		for (i = 1; i < n; i++)
			if (a[i] != a[i - 1]) {
				b[c] = a[i];
				c++;
			}
		System.out.println(c < 3 || (c == 3 && b[1] - b[0] == b[2] - b[1]) ? "YES" : "NO");
	}
}
