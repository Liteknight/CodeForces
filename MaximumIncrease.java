import java.util.Scanner;

public class MaximumIncrease {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), j, max = 0, i = 0, l = -1;

		for (j = 0; j < n; j++) {
			int a = in.nextInt();
			if (a > l) {
				i++;

			} else {
				if (i > max) {
					max = i;
				}
				i = 1;
			}
			l = a;
		}
		if (i > max) {
			max = i;
		}
		System.out.println(max);
		in.close();
	}
}
