import java.util.Scanner;

public class SoldierBananas {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int k = in.nextInt(), n = in.nextInt(), w = in.nextInt(), i, cost = 0;

		for (i = 1; i <= w; i++) {
			cost += i * k;
		}
		System.out.println(Math.max(cost - n, 0));
		in.close();
	}
}
