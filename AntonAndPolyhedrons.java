import java.util.Scanner;

public class AntonAndPolyhedrons {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int faces = 0;
		
		for (int i=0; i<n; i++) {
			String str = sc.next();
			
			if (str.equals("Tetrahedron")) {
				faces += 4;
			} else if (str.equals("Cube")) {
				faces += 6;
			} else if (str.equals("Octahedron")) {
				faces += 8;
			} else if (str.equals("Dodecahedron")) {
				faces += 12;
			} else if (str.equals("Icosahedron")) {
				faces += 20;
			}
		}
		System.out.println(faces);
		sc.close();
	}
}