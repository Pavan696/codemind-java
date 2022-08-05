import java.util.Scanner;
class disk
{
    public static void main(String args[])
    {
        int t,s,b,total;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
         s=sc.nextInt();
         b=sc.nextInt();
         System.out.println(2*t*b*s*512);
         sc.close();
    }
}