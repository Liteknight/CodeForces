import java.util.Scanner;

public class GennadyAndACardGame {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String table = sc.next();
		String play = "NO";
		
		for (int i=0; i<5; i++) {
			String card = sc.next();
			
			if (card.charAt(0) == table.charAt(0) || card.charAt(1) == table.charAt(1)) {
				play = "YES";
			}
		}
		
		System.out.println(play);
		sc.close();
	}
}