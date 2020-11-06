import java.util.Scanner;

public class DimaFriends {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i, f = 0, t = 0;
		for (i = 0; i < n; i++)
			f += in.nextInt();
		in.close();

		for (i = 1; i <= 5; i++)
			if ((f + i) % (n + 1) != 1)
				t++;
		System.out.println(t);
	}
}
