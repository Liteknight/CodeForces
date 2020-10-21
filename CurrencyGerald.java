import java.util.Scanner;

public class CurrencyGerald {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i;
		boolean h = false;

		for (i = 0; i < n; i++) {
			int a = in.nextInt();
			if (a == 1)
				h = true;
		}
		in.close();
		System.out.println(h ? -1 : 1);
	}
}
