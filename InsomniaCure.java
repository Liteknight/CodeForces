import java.util.Scanner;

public class InsomniaCure {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int k = in.nextInt(), l = in.nextInt(), m = in.nextInt(), n = in.nextInt(), d = in.nextInt(), i, x = 0;
		in.close();
		
		for (i = 1; i <= d; i++) {
			if (i % k == 0 || i % l == 0 || i % m == 0 || i % n == 0) { x++; }
		}
		System.out.println(x);
		
	}
}
