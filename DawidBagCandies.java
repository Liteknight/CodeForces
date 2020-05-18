import java.util.Scanner;

public class DawidBagCandies {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int a1 = in.nextInt(), a2 = in.nextInt(), a3 = in.nextInt(), a4 = in.nextInt();
		in.close();

		System.out.println(a1 == a2 + a3 + a4 || a1 + a2 == a3 + a4 || a1 + a2 + a3 == a4 || a1 + a4 == a2 + a3
				|| a1 + a3 == a2 + a4 || a1 + a3 + a4 == a2 || a1 + a2 + a4 == a3 ? "YES" : "NO");
	}
}
