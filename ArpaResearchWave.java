import java.util.Scanner;

public class ArpaResearchWave {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), k = in.nextInt(), t = in.nextInt();

		in.close();
		System.out.println(Math.min(t, n) - Math.max(0, t - k));
	}
}
