import java.util.Scanner;

public class AntonAndDigits {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		long k2 = in.nextLong(), k3 = in.nextLong(), k5 = in.nextLong(), k6 = in.nextLong(), s = 0;
		in.close();

		long x = Math.min(Math.min(k2, k5), k6);
		s += x * 256;
		k2 -= x;

		s += Math.min(k2, k3) * 32;
		System.out.println(s);
	}
}
