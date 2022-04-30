import java.util.Scanner;
class input
{
	public static void main(String args[])
{
	int x,s;
	Scanner sc=new Scanner(System.in);
	
	x=sc.nextInt();

	s=x*(x+1)/2;
	
	System.out.println(+s);
      
	sc.close();
	
}
}