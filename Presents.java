import java.util.Scanner;

public class Presents {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i;
		int[] a = new int[n];

		for (i = 1; i <= n; i++) { a[in.nextInt() - 1] = i; }
		
		in.close();
		for (i = 0; i < n; i++) { System.out.print(a[i] + " "); }
	}
}
