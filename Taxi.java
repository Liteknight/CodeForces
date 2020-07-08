import java.util.Scanner;

public class Taxi {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), a[] = new int[5];

		while (n-- > 0) {
			a[in.nextInt()]++;
		}
		in.close();
		System.out.println((Math.max(0, a[1] - a[3]) + a[2] * 2 + 3) / 4 + a[3] + a[4]);
	}
}
