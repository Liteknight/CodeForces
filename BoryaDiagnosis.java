import java.util.Scanner;

public class BoryaDiagnosis {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i, l = 0, o = 0;

		for (i = 0; i < n; i++) {
			int s = in.nextInt(), d = in.nextInt();
			while (s <= l)
				s += d;
			o += s - l;
			l = s;
		}
		in.close();
		System.out.println(o);
	}
}
