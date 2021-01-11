import java.util.Arrays;
import java.util.Scanner;

public class TokitsukazeMahjong {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String s1 = in.next(), s2 = in.next(), s3 = in.next();
		in.close();

		char c1 = s1.charAt(1), c2 = s2.charAt(1), c3 = s3.charAt(1);
		int i1 = Integer.valueOf(s1.substring(0, 1)), i2 = Integer.valueOf(s2.substring(0, 1)),
				i3 = Integer.valueOf(s3.substring(0, 1)), a[] = new int[] { i1, i2, i3 };

		Arrays.sort(a);
		if (s1.equals(s2) && s1.equals(s3) || (a[2] - a[1] == 1 && a[1] - a[0] == 1 && c1 == c2 && c1 == c3)) {
			System.out.println(0);
			
		} else if (s1.equals(s2) || s1.equals(s3) || s2.equals(s3) || (c1 == c2 && Math.abs(i1 - i2) < 3)
				|| (c1 == c3 && Math.abs(i1 - i3) < 3) || (c2 == c3 && Math.abs(i2 - i3) < 3)) {
			System.out.println(1);
		} else {
			System.out.println(2);
		}
	}
}
