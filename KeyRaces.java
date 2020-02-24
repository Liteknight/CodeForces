
import java.util.Scanner;

public class KeyRaces {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int chars = in.nextInt(), speed1 = in.nextInt(), speed2 = in.nextInt(), ping1 = in.nextInt(), ping2 = in.nextInt();
		int time1 = chars * speed1 + ping1 * 2, time2 = chars * speed2 + ping2 * 2;
		
		if (time1 < time2) { System.out.println("First"); }
		else if (time1 > time2) { System.out.println("Second"); }
		else { System.out.println("Friendship"); }
	
		in.close();
	}
}
