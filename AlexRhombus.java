import java.util.Scanner;

public class AlexRhombus {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), m = n - 1;

		System.out.println(n * n + m * m);
		in.close();
	}
}
