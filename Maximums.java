import java.util.Scanner;

public class Maximums {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		StringBuilder s = new StringBuilder();
		int n = in.nextInt(), i, max = 0;

		for (i = 0; i < n; i++) {
			int b = in.nextInt() + max;
			max = Math.max(max, b);
			s.append(b + " ");
		}
		in.close();
		System.out.println(s.toString());
	}
}
