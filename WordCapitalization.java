import java.util.Scanner;

public class WordCapitalization {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String s = in.next();
		
		System.out.println(s.substring(0, 1).toUpperCase() + s.substring(1));
		in.close();
	}
}
