import java.util.Scanner;

public class Square {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {
			
			int a1 = in.nextInt(), b1 = in.nextInt(), a2 = in.nextInt(), b2 = in.nextInt(), c1 = Math.max(a1, b1);
			System.out.println(c1 == Math.max(a2, b2) && Math.min(a1, b1) + Math.min(a2, b2) == c1 ? "YES" : "NO");
		}
		in.close();
	}
}
