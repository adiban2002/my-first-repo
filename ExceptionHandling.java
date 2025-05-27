import java.util.Scanner;
import java.util.InputMismatchException;

class ExceptionHandling 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        try 
        {
           
            	System.out.print("Enter numerator: ");
            	int numerator = scanner.nextInt();
		System.out.print("Enter denominator: ");
            	int denominator = scanner.nextInt();
		int result = numerator / denominator;

            
            System.out.println("Result: " + result);
        } 
        catch (ArithmeticException e) 
        {
            System.out.println("Error: Division by zero is not allowed.");
        } 
        catch (InputMismatchException e) 
        {
            System.out.println("Error: Invalid input! Please enter an integer.");
        } 
        finally 
        {
           
            scanner.close();
            System.out.println("Program execution completed.");
        }
    }
}

Output:
Enter numerator: 15
Enter denominator: 3
Result: 5
Program execution completed.

Enter numerator: 15
Enter denominator: 0
Error: Division by zero is not allowed.
Program execution completed.

