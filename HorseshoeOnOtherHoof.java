import java.util.Arrays;
import java.util.Scanner;

public class HorseshoeOnOtherHoof {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int[] a = new int[4];
		int c = 0, i;

		for (i = 0; i < 4; i++) {
			a[i] = in.nextInt();
		}
		Arrays.sort(a);
		for (i = 1; i < 4; i++) {
			if (a[i] == a[i - 1]) {
				c++;
			}
		}
		System.out.println(c);
		in.close();
	}
}
