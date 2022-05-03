import java.util.Scanner;
class input{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n;
    double sum = 0.0;
    n = scan.nextInt();
    for(int i=1; i<=n; i++) {
      sum = sum + (1 / (double)i);
    }
    System.out.printf("%.2f",sum);
  }
}