import java.util.Scanner;
class Colour
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        char ch;
        ch=sc.next().charAt(0);
        switch(ch)
        {
            case 'V':
            case 'v':
                System.out.println("Violet");
                break;
            case 'I':
            case 'i':
                System.out.println("Indigo");
                break;
            case 'B':
            case 'b':
                System.out.println("Blue");
                break;
            case 'G':
            case 'g':
                System.out.println("Green");
                break;
            case 'Y':
            case 'y':
                System.out.println("Yellow");
                break;
            case 'O':
            case 'o':
                System.out.println("Orange");
                break;
            case 'R':
            case 'r':
                System.out.println("Red");
                break;
            default:
                System.out.println("-1");
                break;
        }
    }
}