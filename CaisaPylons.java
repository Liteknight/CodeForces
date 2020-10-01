import java.util.Scanner;

public class CaisaPylons {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), m = 0;
		
		while (n-- > 0)
			m = Math.max(m, in.nextInt());
		
		in.close();
		System.out.println(m);
	}
}