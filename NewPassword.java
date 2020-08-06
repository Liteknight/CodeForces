import java.util.Scanner;

public class NewPassword {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), k = in.nextInt(), i;
		in.close();

		String a = "qwertyuiopasdfghjklzxcvbnm", ak = a.substring(0, k);
		for (i = 0; i < n; i++) {
			System.out.print(ak.charAt(i % ak.length()));
		}
	}
}
