import java.util.Scanner;

public class ArpaExam {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), a[] = { 6, 8, 4, 2 };

		in.close();
		System.out.println((n == 0) ? 1 : a[n % 4]);
	}
}
