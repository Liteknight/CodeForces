import java.util.Scanner;

public class ILoveUsername {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), f = in.nextInt(), min = f, max = f, a = 0;

		while (n-- > 1) {
			int x = in.nextInt();
			if (x < min) {
				min = x;
				a++;
			} else if (x > max) {
				max = x;
				a++;
			}
		}
		in.close();
		System.out.println(a);
	}
}
