import java.util.Scanner;

public class TaymyrMurder {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), m = in.nextInt(), z = in.nextInt(), i, c = 0;
		in.close();

		for (i = 1; i <= z; i++) {
			if (i % n == 0 && i % m == 0) {
				c++;
			}
		}
		System.out.println(c);
	}
}
