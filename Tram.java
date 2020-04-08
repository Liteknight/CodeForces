import java.util.Scanner;

public class Tram {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i, max = 0, current = 0;

		for (i = 0; i < n; i++) {

			current -= in.nextInt() - in.nextInt();

			if (current > max) { max = current; }
		}
		System.out.println(max);
		in.close();
	}
}
