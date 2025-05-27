import java.util.Scanner;
class BinarySearch
{
  static int binary_search(int arr[],int left,int right,int target)
  {
    while(left<=right)
    {
      int mid = left + (right - left) / 2 ;
      if(arr[mid] == target)
        return mid;
      if(arr[mid] < target)
        left = mid + 1;
      else
        right = mid - 1;
    }
      return -1;
  }
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the number of elements in the array:");
    int n = scanner.nextInt();
    int[] arr = new int[n];
    System.out.println("Enter the elements of the array:");
    for(int i=0;i<n;i++)
    {
       arr[i] = scanner.nextInt();
    }
    System.out.println("Enter the element to search in the array:");
    int target = scanner.nextInt();
    int result = binary_search(arr,0,n-1,target);
    boolean found = false;
    if(result != -1)
    {
       System.out.println("The element" +  target + "is found in the array at index" + result);
       found = true;
    }
    else
    {
        System.out.println("The element" +  target + "is not found in the array");
    }
    scanner.close();
  }
}

Enter the number of elements in the array:
5
Enter the elements of the array:
6
10
16
18
20
Enter the element to search in the array:
18
The element18is found in the array at index3

