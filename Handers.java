import java.util.Scanner;

public class Handers {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int l = in.nextInt(), r = in.nextInt(), a = in.nextInt();
		in.close();
		
		while (a > 0) {
			if (l > r) {
				r++;
			} else {
				l++;
			}
			a--;
		}
		System.out.println(Math.min(l, r) * 2);
	}
}
