import java.util.Scanner;

public class Team {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i, p = 0;

		for (i = 0; i < n; i++) {
			int a = in.nextInt(), b = in.nextInt(), c = in.nextInt();
			
			if (a + b + c > 1) { p++; }
		}
		System.out.println(p);
		in.close();
	}
}
