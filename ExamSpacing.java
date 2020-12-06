import java.util.Scanner;

public class ExamSpacing {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i;
		in.close();

		if (n < 3) {
			System.out.println("1\n1");
		} else if (n == 3) {
			System.out.println("2\n1 3");
		} else {
			System.out.println(n);
			String s = "3 1 4 2";
			
			for (i = 5; i <= n; i++) {
				if (i % 2 == 0) {
					s += " " + i;
				} else {
					s = i + " " + s;
				}
			}
			System.out.println(s);
		}
	}
}
