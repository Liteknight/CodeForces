import java.util.Scanner;

public class ParkLighting {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		
		while (t-- > 0) {
			System.out.println((int) Math.ceil(in.nextInt() * in.nextInt() / 2.0));
		}
		in.close();
	}
}
