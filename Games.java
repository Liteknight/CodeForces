import java.util.Scanner;

public class Games {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i, c = 0;
		int[] home = new int[n], guest = new int[n];

		for (i = 0; i < n; i++) {
			home[i] = in.nextInt();
			guest[i] = in.nextInt();
		}
		in.close();

		for (int j : home) {
			for (int k : guest) {
				
				if (j == k) { c++; }
			}
		}
		System.out.println(c);
	}
}
