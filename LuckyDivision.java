import java.util.Scanner;

public class LuckyDivision {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		System.out.println(n % 4 == 0 || n % 7 == 0 || n % 47 == 0 || n % 477 == 0 ? "YES" : "NO");
		in.close();
	}
}
