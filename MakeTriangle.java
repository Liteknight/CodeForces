import java.util.Scanner;

public class MakeTriangle {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int a = in.nextInt(), b = in.nextInt(), c = in.nextInt(), big = Math.max(a, Math.max(b, c)), res = 0;

		if (big == a) {
			res = a - b - c;
		} else if (big == b) {
			res = b - a - c;
		} else {
			res = c - a - b;
		}
		
		if (res < 0) {
			System.out.println(0);
		} else {
			System.out.println(res + 1);
		}
		in.close();
	}
}
