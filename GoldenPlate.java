import java.util.Scanner;

public class GoldenPlate {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int w = in.nextInt(), h = in.nextInt(), k = in.nextInt();

		System.out.println(k * (2 * w + 2 * h - 8 * (k - 1) - 4));
		
		in.close();
	}
}
