import java.util.Scanner;

public class IsItRated {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i, l = 5000;
		String o = "maybe";

		for (i = 0; i < n; i++) {
			int a = in.nextInt(), b = in.nextInt();
			if (a != b) {
				o = "rated";
				break;
				
			} else if (a > l) {
				o = "unrated";
			}
			l = a;
		}
		in.close();
		System.out.println(o);
	}
}
