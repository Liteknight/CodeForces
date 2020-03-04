
import java.util.Scanner;
import java.util.ArrayList;

public class Segments {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);		
		int n = in.nextInt(), m = in.nextInt(), i;
		ArrayList<Integer> a = new ArrayList<Integer>();
		
		for (i=1; i<m+1; i++) { a.add(i); }
		
		for (i=0; i<n; i++) {
			
			int l = in.nextInt(), r = in.nextInt(), j;

			for (j=l; j<r+1; j++) {
				if (a.contains(j)) { a.remove(a.indexOf(j)); }
			}
		}
		System.out.println(a.size());
		for (i=0; i<a.size(); i++) { System.out.print(a.get(i) + " "); }
		
		in.close();
	}
}
