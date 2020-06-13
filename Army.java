import java.util.Scanner;

public class Army {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i, y = 0;
		int[] d = new int[n - 1];

		for (i = 0; i < n - 1; i++) {
			d[i] = in.nextInt();
		}
		int a = in.nextInt(), b = in.nextInt();
		in.close();
		for (i = a - 1; i < b - 1; i++) {
			y += d[i];
		}
		System.out.println(y);
	}
}
