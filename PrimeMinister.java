import java.util.Scanner;

public class PrimeMinister {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i, al = in.nextInt(), st = al, sg = al, c = 1;
		String o = "1";

		for (i = 2; i <= n; i++) {
			int a = in.nextInt();
			st += a;

			if (al / 2 >= a) {
				o += " " + i;
				sg += a;
				c++;
			}
		}
		in.close();
		System.out.println(sg * 2 > st ? c + "\n" + o : "0");
	}
}
