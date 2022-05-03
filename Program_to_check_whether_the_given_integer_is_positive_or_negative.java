import java.util.Scanner;
class input
{
	public static void main(String args[])
{
	 int x;
	Scanner sc=new Scanner(System.in);
	x=sc.nextInt();
     if(x>0)
     {
          System.out.println("Positive Number");
     }
     else if(x<0)
     {
         System.out.println("Negative Number");
     }
	sc.close();
	
}
}