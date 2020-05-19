import java.util.Arrays;
import java.util.Scanner;

public class Heist {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i;
		int[] a = new int[n];

		for (i = 0; i < n; i++) {
			a[i] = in.nextInt();
		}
		in.close();
		Arrays.sort(a);
		System.out.println(a[n - 1] - a[0] - n + 1);
	}
}
