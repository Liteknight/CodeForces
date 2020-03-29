import java.util.Scanner;

public class SystemAdministrator {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i, ax = 0, ay = 0, bx = 0, by = 0;

		for (i = 0; i < n; i++) {
			int t = in.nextInt(), x = in.nextInt(), y = in.nextInt();
			
			if (t == 1) {
				ax += x;
				ay += y;
			} else {
				bx += x;
				by += y;
			}
		}
		if (ax >= ay) {
			System.out.println("LIVE");
		} else {
			System.out.println("DEAD");
		}
		if (bx >= by) {
			System.out.println("LIVE");
		} else {
			System.out.println("DEAD");
		}
		in.close();
	}
}
