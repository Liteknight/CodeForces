import java.util.Scanner;

public class DominoPiling {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		double n = in.nextDouble(), m = in.nextDouble();
		
		System.out.println((int) Math.floor(n * m / 2));
		in.close();
	}
}
