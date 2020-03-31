import java.util.ArrayList;
import java.util.Scanner;

public class GoodMatrixA {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i, sum = 0;
		ArrayList<Integer> good = new ArrayList<Integer>();

		for (i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {

				int a = in.nextInt();

				if (i == n / 2 || j == n / 2 || i == j || i + j == n - 1) {
					good.add(a);
				}
			}
		}
		for (int x : good) {
			sum += x;
		}
		System.out.println(sum);
		in.close();
	}
}
