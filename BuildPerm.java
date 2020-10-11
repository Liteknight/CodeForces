import java.util.Arrays;
import java.util.Scanner;

public class BuildPerm {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), a[] = new int[n + 1], i;
		long m = 0;

		a[0] = Integer.MIN_VALUE;
		for (i = 1; i <= n; i++)
			a[i] = in.nextInt();

		in.close();
		Arrays.sort(a);

		for (i = 1; i <= n; i++)
			m += Math.abs(a[i] - i);
		System.out.println(m);
	}
}
