import java.util.Scanner;

public class DelFromLeft {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String s = in.next(), t = in.next();
		in.close();

		int a = s.length(), b = t.length(), i, j, l = 0;
		for (i = a, j = b; i-- > 0 && j-- > 0; l += 2)
			
			if (s.charAt(i) != t.charAt(j))
				break;
		System.out.println(a + b - l);
	}
}
