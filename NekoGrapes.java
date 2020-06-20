import java.util.Scanner;

public class NekoGrapes {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), m = in.nextInt(), en = 0, on = 0, em = 0, om = 0;

		while (n-- > 0) {
			if (in.nextInt() % 2 == 0) {
				en++;
			} else {
				on++;
			}
		}
		while (m-- > 0) {
			if (in.nextInt() % 2 == 0) {
				em++;
			} else {
				om++;
			}
		}
		in.close();
		System.out.println(Math.min(en, om) + Math.min(on, em));
	}
}
