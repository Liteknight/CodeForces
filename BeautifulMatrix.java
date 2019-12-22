import java.util.Scanner;

public class BeautifulMatrix {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int moves = 0, j;
		
		for (j=1; j<6; j++) {
			
			String row = "";
			
			for (int i=1; i<6; i++) {
							
				row += sc.nextInt();			
			}
			if (row.indexOf('1') != -1) {
				
				moves += Math.abs(row.indexOf('1') - 2) + Math.abs(j - 3);
			}
		}		
		System.out.println(moves);		
		sc.close();
	}
}