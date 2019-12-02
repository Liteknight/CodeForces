
import java.util.Scanner;

public class BusToUdayland {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(), j;
		String new_seats = "";
		boolean found = false;
		
		for (j=0; j<n; j++) {
			
			String row = sc.next();
			
			for (int i=0; i<5; i++) {
				
				if (!found && i != 4 && row.charAt(i) == 'O' && row.charAt(i+1) == 'O') {
			
					new_seats += ("++" + row.substring(i+2));
					i += 4;
					found = true;
					
				} else {
					new_seats += (row.charAt(i));
				}
			}
			new_seats += "\n";
		}
		if (found) {
			System.out.println("YES\n" + new_seats);
			
		} else {
			System.out.println("NO");
		}		
		sc.close();
	}
}