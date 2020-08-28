import java.util.Scanner;

public class Haiku {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int v[] = new int[3], i;
		for (i = 0; i < 3; i++) {
			
			String s = in.nextLine();
			for (int j = 0; j < s.length(); j++) {
				if ("aeiou".contains(s.substring(j, j + 1)))
					v[i]++;
			}
		}
		in.close();
		System.out.println(v[0] == 5 && v[1] == 7 && v[2] == 5 ? "YES" : "NO");
	}
}
