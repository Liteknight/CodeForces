import java.util.Arrays;
import java.util.Scanner;

public class ChoreComplex {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), a = in.nextInt(), b = in.nextInt(), h[] = new int[n], i;
		for (i = 0; i < n; i++) {
			h[i] = in.nextInt();
		}
		in.close();
		Arrays.sort(h);
		System.out.println(h[b] - h[b - 1]);
	}
}
