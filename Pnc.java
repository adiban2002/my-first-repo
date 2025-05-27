import java.util.Scanner;
class Pnc
{
  static long factorial(int x)
  {
    int count=1;
    long fact =1;
    while(count<=x)
    {
      fact = fact * count;
      count++;
    }
    return fact;
  }
  public static void main(String[] args)
  {
     Scanner scanner = new Scanner(System.in);
     System.out.println("Enter the total number of elements:");
     int n = scanner.nextInt();
     System.out.println("Enter the number of elements selected from n:");
     int r = scanner.nextInt();
     if(r>n || r<0 || n<0)
      {
      System.out.println("Invalid input! n should be >= r and both should be non-negative:");
      }
     else
      {
      long nPr = factorial(n) / factorial(r);
      long nCr = factorial(n) /( factorial(r) * factorial(n-r));
      
      System.out.println("The required nPr is:" + nPr);
      System.out.println("The required nCr is:" + nCr);
      }
     scanner.close();
  }
}

Enter the total number of elements:
6
Enter the number of elements selected from n:
3
The required nPr is:120
The required nCr is:20

