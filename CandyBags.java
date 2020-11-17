import java.util.Scanner;

public class CandyBags {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i;
		
		for (i = 1; i <= n * n / 2; i++)
			System.out.println(i + " " + (n * n - i + 1));
		in.close();
	}
}
