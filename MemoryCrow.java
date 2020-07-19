import java.util.Scanner;

public class MemoryCrow {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), a[] = new int[n + 1], i;

		for (i = 0; i < n; i++) {
			a[i] = in.nextInt();
			System.out.print(i > 0 ? a[i] + a[i - 1] + " " : "");
		}
		in.close();
		System.out.println(a[n - 1]);
	}
}
