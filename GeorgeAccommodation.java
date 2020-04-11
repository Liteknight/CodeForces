import java.util.Scanner;

public class GeorgeAccommodation {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i, c = 0;

		for (i = 0; i < n; i++) {
			int p = in.nextInt(), q = in.nextInt();

			if (q - p >= 2) { c++; }
		}
		System.out.println(c);
		in.close();
	}
}
