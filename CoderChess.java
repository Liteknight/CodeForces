import java.util.Scanner;

public class CoderChess {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i, j;
		
		in.close();
		StringBuilder o = new StringBuilder();

		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {

				o.append(((i % 2 == 0 && j % 2 == 0) || (i % 2 != 0 && j % 2 != 0) ? 'C' : '.'));
			}
			o.append("\n");
		}
		System.out.println((int) Math.ceil(n * n / 2.0) + "\n" + o);

		in.close();
	}
}
