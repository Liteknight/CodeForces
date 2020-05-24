import java.util.Scanner;

public class SashaSticks {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println(in.nextLong() / in.nextLong() % 2 != 0 ? "YES" : "NO");
		in.close();
	}
}
