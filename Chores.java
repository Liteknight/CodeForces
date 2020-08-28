import java.util.Scanner;

public class Chores {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), k = in.nextInt(), x = in.nextInt(), i, t = 0;

		for (i = 0; i < n - k; i++) {
			t += in.nextInt();
		}
		for (i = n - k; i < n; i++) {
			t += x;
		}
		in.close();
		System.out.println(t);
	}
}
