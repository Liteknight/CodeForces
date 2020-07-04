import java.util.Scanner;

public class IntSeqDiv {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		long n = in.nextLong();

		in.close();
		System.out.println(n * (n + 1) / 2 % 2);
	}
}
