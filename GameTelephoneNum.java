import java.util.Scanner;

public class GameTelephoneNum {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i, o = (n - 11) / 2 + 1;
		String s = in.next();
		in.close();

		for (i = 0; i < n - 10; i++)
			if (s.charAt(i) == '8')
				o--;
		System.out.println(o < 1 ? "YES" : "NO");
	}
}
