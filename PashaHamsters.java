import java.util.Scanner;

public class PashaHamsters {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), a = in.nextInt(), b = in.nextInt(), c[] = new int[n], i;
		for (i = 0; i < a; i++) {
			c[in.nextInt() - 1] = 1;
		}
		for (i = 0; i < b; i++) {
			c[in.nextInt() - 1] = 2;
		}
		in.close();
		for (int j : c) {
			System.out.print(j + " ");
		}
	}
}
