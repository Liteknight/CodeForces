import java.util.Scanner;

public class PetyaAndOrigami {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		double n = in.nextInt(), k = in.nextInt();
		
		System.out.println((int)(Math.ceil(2 * n / k) + Math.ceil(5 * n / k) + Math.ceil(8 * n / k)));
		in.close();
	}
}
