import java.util.Scanner;
class input
{
	public static void main(String args[])
{
	int x;
	float av;
	Scanner sc=new Scanner(System.in);
	x=sc.nextInt();
	
	av=32+(x*9/5.0f);
      System.out.printf("%.2f",av);
	sc.close();
	
}
}