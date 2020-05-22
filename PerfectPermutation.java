import java.util.Scanner;

public class PerfectPermutation {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.close();

		if (n % 2 != 0) {
			System.out.println(-1);
		} else {
			
			for (int i = 1; i < n; i += 2) {
				System.out.printf("%d %d ", i + 1, i);
			}
		}
	}
}
