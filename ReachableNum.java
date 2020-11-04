import java.util.Scanner;

public class ReachableNum {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		long n = in.nextLong(), c = 10;
		in.close();

		while (n > 9) {
			n++;
			c++;
			while (n % 10 == 0)
				n /= 10;
		}
		System.out.println(c - 1);
	}
}
