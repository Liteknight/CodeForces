import java.util.Scanner;

public class TriangleNum {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i, o = 0;
		in.close();

		for (i = 1; i < 32; i++) {
			if (n == i * (i + 1) / 2) {
				o = 1;
			}
		}
		System.out.println(o == 1 ? "YES" : "NO");
	}
}
