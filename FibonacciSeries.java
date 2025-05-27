import java.util.Scanner;
class FibonacciSeries
{
  static int fibonacci(int n)
  {
      if(n == 1 || n== 2)
        return 1;
      else
        return (fibonacci(n-1) + fibonacci(n-2));
  }
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the term number:");
    int term = scanner.nextInt();
    int f;
    f = fibonacci(term);
    System.out.println("The required term is" + f);
    
    scanner.close();
  }
}

Enter the term number:
6
The required term is8
     
