import java.util.Scanner;
class QuickSort
{
  void quick_sort(int arr[],int low,int high)
  {
    if(low < high)
    {
      int pivot_index = partition(arr,low,high);
      quick_sort(arr,low,pivot_index - 1);
      quick_sort(arr,pivot_index + 1 , high);
    }
  }
  int partition(int arr[],int low,int high)
  {
    int pivot = arr[high];
    int i = low - 1;
    for(int j = low ; j < high ; j++)
    {
      if(arr[j] < pivot)
      {
        i++;
        swap(arr,i,j);
      }
    }
    swap(arr,i+1,high);
    return i+1;
  }
  void swap(int arr[],int i,int j)
  {
    int temp = arr[i];
    arr[i]= arr[j];
    arr[j] = temp;
  }
  void display_array(int arr[],int n)
  {
    for(int i=0 ; i < n ; i++)
    {
      System.out.print(arr[i] + " ");
    }
      System.out.println();
  }
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the number of elements in the original array:");
    int n = scanner.nextInt();
    int[] arr = new int[n];
    System.out.println("Enter the elements of the original array:");
    for(int i=0;i<n;i++)
    {
       arr[i] = scanner.nextInt();
    }
    System.out.println("Original array:");
    QuickSort obj = new QuickSort();
    obj.display_array(arr,n);
    obj.quick_sort(arr,0, n-1);
    System.out.println("Sorted array:");
    obj.display_array(arr,n);
    scanner.close();
  }
}

Enter the number of elements in the original array:
10
Enter the elements of the original array:
6
8
4
5
10
15
12
13
15
9
Original array:
6 8 4 5 10 15 12 13 15 9 
Sorted array:
4 5 6 8 9 10 12 13 15 15 
   
