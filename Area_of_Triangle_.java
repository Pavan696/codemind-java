import java.util.Scanner;
 class input {
public static Scanner sc;

	public static void main(String[] args) {
		double a, b, c, Perimeter, s, Area;
		sc = new Scanner(System.in);
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		s = (a + b + c)/2; // Perimeter/2
		Area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.format("%.2f
",Area);
	}}