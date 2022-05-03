import java.util.Scanner;
class input
{
	public static void main(String args[])
{
	float x,y,av;
	Scanner sc=new Scanner(System.in);
	x=sc.nextFloat();
	y=sc.nextFloat();
	av=x*y;
      System.out.printf("%.2f",av);
	sc.close();
	
}
}