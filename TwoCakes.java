import java.util.Scanner;

public class TwoCakes {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), a = in.nextInt(), b = in.nextInt(), i, o = 0;
		in.close();

		for (i = 1; i < n; i++)
			o = Math.max(o, Math.min(a / i, b / (n - i)));
		System.out.println(o);
	}
}
