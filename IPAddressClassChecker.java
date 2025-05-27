import java.util.Scanner;
public class IPAddressClassChecker 
{
    
   public static String binaryToDecimal(String binaryIP) 
    {
        String[] parts = binaryIP.split("\\.");
        StringBuilder decimalIP = new StringBuilder();
        for (String part : parts) 
        {
            int decimal = Integer.parseInt(part, 2);
            decimalIP.append(decimal).append(".");
        }
       return decimalIP.substring(0, decimalIP.length() - 1);
    }

   
    public static String getClassByDecimal(String ip) 
    {
        int firstOctet = Integer.parseInt(ip.split("\\.")[0]);
        if (firstOctet >= 0 && firstOctet <= 127)
            return "Class A";
        else if (firstOctet >= 128 && firstOctet <= 191)
            return "Class B";
        else if (firstOctet >= 192 && firstOctet <= 223)
            return "Class C";
        else if (firstOctet >= 224 && firstOctet <= 239)
            return "Class D";
        else if (firstOctet >= 240 && firstOctet <= 255)
            return "Class E";
        else
            return "Invalid IP";
    }

   
    public static String getClassByBitwise(String ip) 
    {
        int firstOctet = Integer.parseInt(ip.split("\\.")[0]);
        if ((firstOctet & 0b10000000) == 0)
            return "Class A";
        else if ((firstOctet & 0b11000000) == 0b10000000)
            return "Class B";
        else if ((firstOctet & 0b11100000) == 0b11000000)
            return "Class C";
        else if ((firstOctet & 0b11110000) == 0b11100000)
            return "Class D";
        else if ((firstOctet & 0b11110000) == 0b11110000)
            return "Class E";
        else
            return "Invalid IP";
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose IP input format:");
        System.out.println("1. Decimal (e.g. 192.168.0.1)");
        System.out.println("2. Binary (e.g. 11000000.10101000.00000000.00000001)");
        int choice = sc.nextInt();
        sc.nextLine(); 

        String inputIP = "";
        String decimalIP = "";

        if (choice == 1) 
        {
            System.out.print("Enter IP address in Decimal format: ");
            inputIP = sc.nextLine();
            decimalIP = inputIP;
        } 
        else if (choice == 2) 
        {
            System.out.print("Enter IP address in Binary format: ");
            inputIP = sc.nextLine();
            decimalIP = binaryToDecimal(inputIP);
        } 
        else 
        {
            System.out.println("Invalid choice!");
            return;
        }

        System.out.println("\nDecimal IP: " + decimalIP);

        String classByDecimal = getClassByDecimal(decimalIP);
        String classByBitwise = getClassByBitwise(decimalIP);

        System.out.println("Class using Decimal Range: " + classByDecimal);
        System.out.println("Class using Bitwise Pattern: " + classByBitwise);
    }
}

