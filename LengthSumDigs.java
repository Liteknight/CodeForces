import java.util.Scanner;

public class LengthSumDigs {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int l = in.nextInt(), s = in.nextInt(), s1 = s - 1, i;
		in.close();

		if (s == 0 && l > 1 || s > 9 * l) {
			System.out.println("-1 -1");
			return;
		}
		String max = "", min = "";
		for (i = 0; i < l; i++) {
			int x = Math.min(9, s);
			max += x;
			s -= x;
		}
		for (i = 0; i < l - 1; i++) {
			int x = Math.min(9, s1);
			min = x + min;
			s1 -= x;
		}
		min = (s1 + 1) + min;
		System.out.println(min + " " + max);
	}
}
