import java.util.Scanner;

public class AnastasiaPebbles {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		double n = in.nextDouble(), k = in.nextDouble(), s = 0;

		for (int i = 0; i < n; i++)
			s += Math.ceil(in.nextDouble() / k);

		in.close();
		System.out.println((int) Math.ceil(s / 2));
	}
}
