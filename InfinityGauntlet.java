import java.util.HashMap;
import java.util.Scanner;

public class InfinityGauntlet {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		HashMap<String, String> pairs = new HashMap<String, String>();

		pairs.put("purple", "Power");
		pairs.put("green", "Time");
		pairs.put("blue", "Space");
		pairs.put("orange", "Soul");
		pairs.put("red", "Reality");
		pairs.put("yellow", "Mind");

		int n = in.nextInt(), i;
		for (i = 0; i < n; i++) {
			
			String c = in.next();
			pairs.remove(c);
		}
		System.out.println(pairs.size());
		
		for (String s : pairs.values()) {
			System.out.println(s);
		}
		in.close();
	}
}
