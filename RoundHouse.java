import java.util.Scanner;

public class RoundHouse {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), a = in.nextInt(), b = in.nextInt(), x = (a + b - 1) % n + 1;
		
		in.close();
		System.out.println(x < 1 ? x + n : x);
	}
}