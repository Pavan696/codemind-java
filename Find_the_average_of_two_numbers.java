import java.util.Scanner;
class input
{
	public static void main(String args[])
{
	int x,y,s;
	float av;
	Scanner sc=new Scanner(System.in);
	
	x=sc.nextInt();
	y=sc.nextInt();
	s=x+y;
	av=(s)/2.0f;

     
      System.out.printf("%.4f",av);
	sc.close();
	
}
}