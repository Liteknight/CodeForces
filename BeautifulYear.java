import java.util.Arrays;
import java.util.Scanner;

public class BeautifulYear {

	public static char[] helper(int y) {
		char[] a = new char[4];

		for (int i = 0; i < 4; i++) {
			a[i] = String.valueOf(y).charAt(i);
		}
		Arrays.sort(a);
		return a;
	}
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int y = in.nextInt() + 1, i;
		in.close();
		boolean dis = false;

		while (!dis && y < 9013) {
			char[] ac = helper(y);

			for (i = 1; i < 4; i++) {

				if (ac[i] == ac[i - 1]) {
					y++;
					dis = false;
					break;

				} else {
					dis = true;
				}
			}
		}
		System.out.println(y);
	}
}
