import java.util.Scanner;

public class PilesWithStones {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i, s1 = 0, s2 = 0;

		for (i = 0; i < n; i++) {
			s1 += in.nextInt();
		}
		for (i = 0; i < n; i++) {
			s2 += in.nextInt();
		}
		in.close();
		System.out.println(s1 >= s2 ? "Yes" : "No");
	}
}
