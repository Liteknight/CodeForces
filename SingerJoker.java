import java.util.Scanner;

public class SingerJoker {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), d = in.nextInt(), i, t = 0, j = 0;
		for (i = 0; i < n; i++) {
			t += in.nextInt() + 10;
			j += 2;
		}
		System.out.println(t - 10 <= d ? (int) Math.floor(j + (d - t) / 5.0) : -1);
		in.close();
	}
}
