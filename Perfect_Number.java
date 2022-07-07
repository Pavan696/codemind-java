import java.util.*;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,m=0,i;
        n=sc.nextInt();
        for(i=1;i<n;i++)
        {
            if(n%i==0)
            m=m+i;
        }
        if(m==n)
        System.out.println("True");
        else
        System.out.println("False");
    }
}