import java.util.Scanner;

public class JohnLikeNum {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		double n = in.nextDouble(), k = in.nextDouble();

		in.close();
		System.out.println((int) (Math.ceil((n + 1) / k) * k));
	}
}
