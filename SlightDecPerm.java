import java.util.Scanner;

public class SlightDecPerm {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), k = in.nextInt(), a = n - (k + 1), i;
		in.close();

		for (i = 1; i <= a; i++)
			System.out.print(i + " ");
		for (i = n; i > a; i--)
			System.out.print(i + " ");
	}
}
