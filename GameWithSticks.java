import java.util.Scanner;

public class GameWithSticks {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println(Math.min(in.nextInt(), in.nextInt()) % 2 == 0 ? "Malvika" : "Akshat");
		in.close();
	}
}
