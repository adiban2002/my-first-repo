import java.util.Scanner;
class Factorial
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a number to find its factorial:");
    int num = scanner.nextInt();
    int fact = 1;
    for(int i=1 ; i<=num ; i++)
    {
      fact = fact * i ;
    }
    System.out.println("The factorial of" + num + "is" + fact);
    scanner.close();
  }
}

Enter a number to find its factorial:
5
The factorial of5is120

    
