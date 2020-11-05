import java.util.Arrays;
import java.util.Scanner;

public class NumDiv {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i, a[] = new int[n];
		long s = 0;
		
		for (i = 0; i < n; i++)
			a[i] = in.nextInt();
		in.close();
		
		Arrays.sort(a);
		for (i = 0; i < n / 2; i++)
			s += Math.pow(a[i] + a[n - i - 1], 2);
		System.out.println(s);
	}
}
